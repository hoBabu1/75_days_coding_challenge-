import java.util.*;
public class DijkstrasAlgo
{
    public static void main(String args[])
    {
        ArrayList<Edge> graph[] = new ArrayList[6];
        CreateGraph(graph);
        Dijkstras(graph , 0);
        
    }
    public static void  Dijkstras(ArrayList<Edge> graph[] , int src )
    {
        int dist[] = new int[graph.length];
        // initialize all distance with +infinity , exclude src 
        for(int i = 0 ; i<dist.length ; i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MAX_VALUE;//--> +infinity
            }
        }
        boolean visit[] = new boolean[graph.length];
        // priority queue 
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src , 0));
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove();
            if(!visit[curr.n])
            {
                visit[curr.n] = true ;
                for(int i = 0 ; i<graph[curr.n].size();i++)
                {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src ;
                    int v = e.dest ;
                    int wt = e.wt;
                    if(dist[u]+wt < dist[v])
                    {
                        dist[v] = dist[u]+wt ;
                    }
                    pq.add(new Pair(v , dist[v]));
                }
            }

        }
        for(int i = 0 ; i<dist.length ; i++)
        {
            System.out.print(dist[i]+" ");
        }
    }
    public static class Pair implements Comparable<Pair>
    {
        int n ;
        int path;
        public Pair(int n , int path )
        {
            this.path = path ;
            this.n = n ;
        }
        @Override
        public int compareTo(Pair p2)
        {
            return this.path - p2.path; // sorting on basis of path 
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[])
    {
        for(int i = 0 ; i<graph.length ; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));
        graph[2].add(new Edge(2,4,3));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,5,5));
        graph[4].add(new Edge(4,3,2));

    }
    public static class Edge{
        int src ;
        int dest ;
        int wt ;
        public Edge(int src , int dest , int wt )
        {
            this.wt = wt ;
            this.dest = dest ;
            this.src = src;
        }
    }
}