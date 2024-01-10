import java.util.*;
public class PrimsAlgorithm
{
    public static void main(String args[])
    {
        ArrayList<Edge> graph[] = new ArrayList[4];
        CreateGraph(graph);
        prims(graph , 0);
    }
    public static void  prims(ArrayList<Edge> graph[] , int src )
    {
        boolean visit[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src , 0));
        int minimumcost = 0;
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove();
            if(!visit[curr.vertex])
            {
                visit[curr.vertex]= true;
                minimumcost=minimumcost+curr.cost;
                for(int i = 0 ; i<graph[curr.vertex].size();i++)
                {
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pair(e.dest , e.wt));
                }
            }
        }
        System.out.println(minimumcost);
        
    }
    public static class Pair implements Comparable<Pair>
    {
        int vertex ;
        int cost;
        public Pair(int vertex , int cost )
        {
            this.cost = cost ;
            this.vertex= vertex;
        }
        @Override
        public int compareTo(Pair p2)
        {
            return this.cost - p2.cost; // sorting on basis of path 
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[])
    {
        for(int i = 0 ; i<graph.length ; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
        graph[1].add(new Edge(1,3,40));
        graph[1].add(new Edge(1,0,10));
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,2,50));
        graph[3].add(new Edge(3,1,40));
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