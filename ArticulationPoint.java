import java.util.*;
public class ArticulationPoint
{
    public static void main(String args[])
    {
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        Trajan(graph);
    }
    public static void Trajan(ArrayList<Edge> graph[])
    {
        boolean visit[]  = new boolean[graph.length];
        int disT [] = new int [graph.length];
        int lowT [] = new int[graph.length];
        int time = 0 ;
        boolean ap[]  = new boolean[graph.length];
        for(int i = 0 ; i<graph.length ; i++)
        {
            if(!visit[i])
            {
                dfsUtil(graph , disT , lowT , -1 , visit , i  , time  , ap );
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge> graph[], int disT[], int lowT [] , int par , boolean visit[] , int curr , int time  , boolean ap[])
    {
        visit[curr] = true ;
        disT[curr] = lowT[curr] =++time;
        int children = 0;
        for(int i = 0 ; i<graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if(e.dest == par)
            {
                continue;
            }
            else if(!visit[e.dest])
            {
                dfsUtil(graph , disT , lowT , e.src , visit , e.dest , time , ap );
                lowT[e.src] = Math.min(lowT[e.src] , lowT[e.dest]);
                if(par !=  -1 && disT[curr] <= lowT[e.dest] && ap[curr] == false )
                {ap[curr] = true ;
                    System.out.println(e.src);

                }  
                children++;
            }
            else 
            {
                lowT[e.src] = Math.min(lowT[e.src] , disT[e.dest]);
            }
        }
        if(par == -1 && children > 1 && ap[curr] == false)
        {
            System.out.println(curr);
        }
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i = 0 ; i< graph.length ; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));
        
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
     //   graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
       // graph[4].add(new Edge(4,5));
        
       // graph[5].add(new Edge(5,3));
       // graph[5].add(new Edge(5,4));
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