import java.util.*;
public class connectionCitiesWithMinimumCost {
    public static void main(String args[])
    {
        int cities[][] = {
                         {0,1,2,3,4},
                         {1,0,5,0,7},
                         {2,5,0,6,0},
                         {3,0,6,0,0},
                         {4,7,0,0,0}
        };
        ArrayList<Edge> graph[] =  new ArrayList[5];
        createGraph(cities,graph);
        minimumCost(graph);

    }
    public static void minimumCost(ArrayList<Edge> graph[])
    {
        int mCost = 0 ;
        boolean visit[] = new boolean[graph.length];
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        pq.add(new Pairs(0,0));
        while(!pq.isEmpty())
        {
            Pairs curr = pq.remove();

            if(!visit[curr.vertex])
            {
                mCost+=curr.cost;
                visit[curr.vertex] = true ;
                for(int i = 0 ; i<graph[curr.vertex].size() ; i++)
                {
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pairs(e.dest , e.wt));
                }
            }
        }
        System.out.println(mCost);
    }
    public static void createGraph(int cities[][] , ArrayList<Edge> graph[] )
    {
        for(int i = 0 ; i<graph.length ; i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i = 0 ; i<graph.length ; i++)
        {
            int temp = 0 ;
            for(int j = 0 ; j<graph.length ; j++)
            {
                int src = cities[i][0];
                int dest = temp;
                int cost = cities[i][j];
                if(cost == 0 )
                {
                    temp++;
                    continue ;
                }
                else 
                {
                    graph[i].add(new Edge(src , dest , cost));
                    temp++;
                }
            }
        }
    }
    public static class Edge 
    {
        int src;
        int dest ;
        int wt ;
        public Edge(int src , int dest , int wt)
        {
            this.wt=wt;
            this.src = src;
            this.dest=dest;
        }
    }
    public static class  Pairs implements Comparable<Pairs>
    {
        int vertex ;
        int cost ;
        public Pairs( int vertex , int cost )
        {
            this.cost = cost ;
            this.vertex = vertex ;
        }
        public int compareTo(Pairs p2 )
        {
            return this.cost - p2.cost;
        }
    }
}
