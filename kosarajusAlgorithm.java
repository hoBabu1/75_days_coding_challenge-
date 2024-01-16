import java.util.*;
public class kosarajusAlgorithm
{
    public static void main(String args[])
    {
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        kosaraju(graph);

    }
    public static void kosaraju( ArrayList<Edge> graph[])
    {
        // step  1 
        Stack<Integer> s = new Stack<>();
        boolean visit[] = new boolean[graph.length];
        for(int i = 0 ; i<graph.length ; i++)
        {
            if(!visit[i])
            {
                topSortUtil(s , graph , i , visit);
            }
        }
        // stepp 2 --> transpose of a graph
        ArrayList<Edge> transposeGraph[] = new ArrayList[5];
        for(int i = 0 ; i< transposeGraph.length ; i++)
        {
            visit[i] = false ;
            transposeGraph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i<graph.length ; i++)
        {
            for(int j = 0 ; j<graph[i].size();j++)
            {
                
                Edge e = graph[i].get(j); // e.src ---> e.dest
                transposeGraph[e.dest].add(new Edge(e.dest , e.src)); // reverse 
            }
        }
        // step 3 
        while(!s.isEmpty())
        {
            int curr = s.pop();
            if(!visit[curr])
            {
                dfs( transposeGraph , curr , visit );
                System.out.println();
            }
        }


    }
    public static void dfs(ArrayList<Edge> graph[] , int curr , boolean visit[])
    {
        visit[curr] = true ;
        System.out.print(curr+" ");
        for(int i = 0 ; i<graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if(!visit[e.dest])
            {
                dfs( graph , e.dest , visit);
            }
        }

    }
    public static void topSortUtil(Stack<Integer> s , ArrayList<Edge> graph[] , int curr , boolean visit[])
    {
        visit[curr] = true ;
        for(int i = 0 ; i<graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if(!visit[e.dest])
            {
                topSortUtil(s , graph , e.dest , visit);
                
            }
        } 
        s.push(curr);
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i = 0 ; i< graph.length ; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,4));


    }
    public static class Edge 
    {
        int src;
        int dest ;
        //int wt ;
        public Edge(int src , int dest  )
        {
            this.src = src;
            this.dest= dest ;
           // this.wt = wt ;
        }
    }
}