import java.util.*;
public class CheapestFlightWithMinimumKstops
{     public static void main(String args[])
    {
        int n = 4 ;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0 ; 
        int dest = 3 ;
        int k = 1;
        ArrayList<Edge> graph[] = new ArrayList[4];
        createGraph(graph ,flights );
        System.out.println(Cheapest(graph , src , dest , k));
    }
    public static int Cheapest(ArrayList<Edge> graph[] , int src , int dest ,int k )
    {
        Queue<Pair> q = new LinkedList<>();
        
        int dist [] = new int[4];
        // initialize with max value 
        for(int i = 0 ; i<dist.length ; i++)
        {
            dist[i] = Integer.MAX_VALUE;
        }
        q.add(new Pair(src,0,0));
        while(!q.isEmpty())
        {
            Pair curr = q.remove();
            if(curr.stops > k)
            {
                break;
            }
            for(int i = 0 ; i<graph[curr.v].size();i++)
            {
                Edge e = graph[curr.v].get(i);
                int u = e.src ;
                int v = e.dest;
                int w = e.wt;
                if(curr.cost+w < dist[v] && curr.stops<=k)
                {
                    dist[v] = curr.cost+w;
                    q.add(new Pair(v , dist[v] , curr.stops+1));
                }
            }
        }
        if(dist[dest] == Integer.MAX_VALUE)
        {
            return -1;
        }
        else 
        {
            return dist[dest];
        }
        
    }
    public static class Pair 
    {
        int v ; 
        int  stops ;
        int cost ;
        public Pair(int v , int cost , int stops )
        {
            this.v = v;
            this.stops= stops;
            this.cost = cost;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]  , int flights[][])
    {
        // initialize with empty array list 
        for(int i = 0 ; i<graph.length ; i++)
        {
            graph[i] =new ArrayList<>();
        }
        ///creation 
        for(int i = 0 ; i<flights.length ; i++)
        {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            graph[src].add(new Edge(src , dest , wt));
        }
    }
    public static class Edge 
    {
        int src ; 
        int dest ;
        int wt ; 
        public Edge(int src , int dest , int wt )
        {
            this.wt = wt ; 
            this.src = src ;
            this.dest = dest;
        }
    }
}