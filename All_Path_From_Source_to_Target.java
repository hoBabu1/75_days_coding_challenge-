import java.util.ArrayList;

public class All_Path_From_Source_to_Target {
    public static void main(String args[])
    {
        ArrayList<Edge> graph[] = new ArrayList[6];
        graphCreation(graph);
        ArrayList<Integer> path = new ArrayList<>();
        int src = 2 ;
        path.add(src);
        allPaths(graph , src, 1 , path);
    }
    public static void allPaths(ArrayList<Edge> graph[] , int src , int tgt , ArrayList<Integer> path){
        if(src == tgt)
        {
            for(int i = 0 ; i<path.size();i++)
            {
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 0 ; i<graph[src].size();i++)
        {
            Edge e = graph[src].get(i);
            path.add(e.dest);
            allPaths(graph , e.dest , tgt , path);
            path.remove(path.size()-1);
        }
        

      
    }
    public static class Edge{
        int src ;
        int dest;
        public Edge(int src , int dest)
        {
            this.src = src ;
            this.dest=dest;
        }
    }
    public static void graphCreation(ArrayList<Edge> graph[])
    {
        for(int i = 0 ; i<graph.length ; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    
}
