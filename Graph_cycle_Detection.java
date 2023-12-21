import java.util.*;
public class Graph_cycle_Detection {
    public static void main(String args[])
    {
        ArrayList<Edge> graph[]  = new ArrayList[5];
        graphceation(graph);
        System.out.println(detectcycle(graph));



    }
    public static class Edge 
    {
        int src ;
        int dest ;
        public Edge(int src , int dest)
        {
            this.dest = dest ;
            this.src = src;
        }
        ArrayList<Edge> graph[]  = new ArrayList[5];
    }
    public  static boolean detectcycle( ArrayList<Edge> graph[])
    {
        boolean visit [] = new boolean[graph.length];
        for(int i = 0 ; i<graph.length ; i++)
        {
            Edge e = graph[i].get(0);
            if(!visit[e.src])
            {
                if(detectcycleUtil(graph, -1 , visit , e.src)){
                    return true ;
                    //cycle exits in graph 
                }
            }
        }
        return false ;
    }
    public  static boolean detectcycleUtil( ArrayList<Edge> graph[] , int parent , boolean visit[] , int curr)
    {
        visit[curr]= true ;
        for(int i = 0 ; i<graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if(!visit[e.dest] )
            {
               if(detectcycleUtil(graph , curr ,visit , e.dest ) )
               return true ;
            }
            else if(visit[graph[curr].get(i).dest] && parent != graph[curr].get(i).dest )
            {
                return true ;
            }
        }
        return false ;

    }

    public static void graphceation(ArrayList<Edge> graph[])
    {
        /**
         *      0-----3
         *   /  |     |
         *  /   |     |
         * /    |     |
         * 1    |     |
         *  \   |     4
         *   \  2
         */
        for(int i = 0 ; i<graph.length ; i++)
        {
            graph[i] = new ArrayList<>();
        }
       // graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

     //   graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }
    
}
