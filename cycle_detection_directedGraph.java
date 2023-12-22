import java.util.ArrayList;

public class cycle_detection_directedGraph {
    public static void main(String args[])
    {
        ArrayList<Edge> graph[] = new ArrayList[4];
        ArrayList<Edge> graph2[] = new ArrayList[4];
        graphceation(graph);// // cycle is present--> true
        graphceation2(graph2); // no cycle --> false 
        System.out.println("this for graph 1st -->"+isCycle(graph));
        System.out.println("this for graph 2nd -->"+isCycle(graph2));
    }
    public static boolean isCycle(ArrayList<Edge> graph[])
    {
        boolean visit[]= new boolean[graph.length];
        boolean stack [] = new boolean[graph.length];
        for(int i =0  ; i<graph.length ; i++)
        {
            
            if(visit[i] != true )
            {
                if(isCycleUtil(graph , i , visit , stack))
                {
                return true;
                }
            }   
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge> graph[] , int curr, boolean visit[], boolean stack[])
    {
        visit[curr] = true ;
        stack[curr] = true ;
        for(int i = 0 ; i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(stack[e.dest] == true )
            {
                return true; //cycle
            }
            else if(visit[e.dest] != true)
            {
                if(isCycleUtil(graph , e.dest , visit , stack))
                {
                    return true;
                }
            }
            
        }
        stack[curr] = false;
        return false;

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
    }
    public static void graphceation(ArrayList<Edge> graph[])
    {
        // cycle is present
        for(int i = 0 ; i<graph.length ; i++)
        {
            graph[i] = new ArrayList<>();
        }
      
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));
       
    }
    public static void graphceation2(ArrayList<Edge> graph[])
    {
        // cycle is present
        for(int i = 0 ; i<graph.length ; i++)
        {
            graph[i] = new ArrayList<>();
        }
      
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,3));

    }
    
}
