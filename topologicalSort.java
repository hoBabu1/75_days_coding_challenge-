import java.util.*;

public class topologicalSort {
    public static void main(String args[])
    {
        ArrayList<Edge> graph[] = new ArrayList[6];
        graphCreation(graph);
        topological(graph);


    }
    public static void topological(ArrayList<Edge> graph[])
    {
        boolean visit[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i<graph.length ; i++)
        {
            if(!visit[i])
            {
                topologicalUtil(graph , s , visit , i);
            }
        }
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
    public static void topologicalUtil(ArrayList<Edge> graph[], Stack<Integer> s , boolean visit[],int curr)
    {
        visit[curr] = true ;
        for(int i = 0 ; i<graph[curr].size();i++ )
        {
            if(!visit[graph[curr].get(i).dest])
            {
                topologicalUtil(graph , s , visit , graph[curr].get(i).dest);
            }
        }
        s.push(curr);

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
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));



    }
}
