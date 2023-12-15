import java.util.*;
/*
    Find wether there is path between src and destination exist or not !!!!!!!
 * 
 */
public class Has_Path {
    public static void main(String args[])
    {
        // its a array of arrayList 
        ArrayList<Edge> graph[] = new ArrayList[7];
        // initialize every index with array list 
        for(int i = 0 ; i<graph.length;i++)
        {
            graph[i] = new ArrayList();
        }
        // 0 vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        // 1st vertex 
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        // 2nd index 
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        //3rd vertex 
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));
        //4th vertex 
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));
        // 5h vertex 
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));  
        graph[5].add(new Edge(5,6));
        //6th vertex
        graph[6].add(new Edge(6,5));
        boolean visit[] = new boolean[graph.length];
        int curr = graph[0].get(0).src;
        System.out.println(hasPath(graph , visit , 0 , 10));
    }
    public static boolean  hasPath(ArrayList<Edge> graph[] ,boolean visit[], int src ,int dest)
    { 
        visit[src] = true ;
        if(src == dest )
        {
            return true ;
        }
        for(int i = 0 ; i<graph[src].size(); i++ )
        {
            if(visit[graph[src].get(i).dest] != true )
            {
                return hasPath(graph , visit ,graph[src].get(i).dest, dest);
            }
        }
        return false ;
       
    }
    public static class Edge 
    {
        int src ;
        int dest;
        int wt ;
        public Edge(int src , int dest )
        {
            this.src = src;
            this.wt = -1;
            this.dest = dest;
        }
    } 
}
