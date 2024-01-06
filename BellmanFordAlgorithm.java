import java.util.*;
public class BellmanFordAlgorithm
{
    public static void main(String args[])
    {
        ArrayList<Edge> graph[] = new ArrayList[5];
        CreateGraph(graph);
        BellmanFord(graph , 0);
        
    }
    public static void  BellmanFord(ArrayList<Edge> graph[] , int src )
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
        int V = graph.length;
        // BeallmanFord --> v-1 times 
        for(int i = 0 ; i<V-1;i++)
        {
            for(int j = 0 ; j<graph.length ; j++)
            {
                for(int k = 0 ; k<graph[j].size();k++)
                {
                    Edge e = graph[j].get(k);
                    int u = e.src ;
                    int v = e.dest;
                    int wt = e.wt;
                    // relaxation
                    if(dist[u]!= Integer.MAX_VALUE && dist[u]+wt <dist[v])
                    {
                        dist[v] = dist[u]+wt;
                    }
                }
            }
        }
        for(int i = 0 ; i<dist.length ; i++)
        {
            System.out.print(dist[i]+" ");
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
        graph[1].add(new Edge(1,2,-4));
        graph[2].add(new Edge(2,3,2));
        graph[3].add(new Edge(3,4,4));
        graph[4].add(new Edge(4,1,-1));
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