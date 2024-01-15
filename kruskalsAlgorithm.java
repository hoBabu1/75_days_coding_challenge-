import java.util.*;
public class kruskalsAlgorithm {
    public static void main(String args[])
    {
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        kruskal(graph , 4);
    }
    public static void kruskal(ArrayList<Edge> graph , int v )
    {
        initialization(par , rank);
        Collections.sort(graph);
        int max = 0 ;
        for(int i = 0 ; i<graph.size()-1; i++)
        {
            Edge e = graph.get(i);
            if(find(e.src) != find(e.dest))
            {
                max = max+e.wt;
                union(e.dest , e.src);  
            }
        }
        System.out.println(max);
        

    }
    public static void createGraph(ArrayList<Edge> graph)
    {
        graph.add(new Edge(0,1,10));
        graph.add(new Edge(0,2,15));
        graph.add(new Edge(0,3,30));
        graph.add(new Edge(1,3,40));
        graph.add(new Edge(2,3,50));

    }
    public static class Edge implements Comparable<Edge>
    {
        int src ;
        int wt ;
        int dest ;
        public Edge(int src , int dest , int wt )
        {
            this.wt = wt ;
            this.src = src;
            this.dest= dest;
        }
        public int compareTo(Edge p2)
        {
            return this.wt-p2.wt;
        } 
    }
    static  int n = 5;
       static  int par [] = new int[n];
       static  int rank[] = new int[n];
    public static void union(int x , int y )
    {
        int parX = find(x);
        int parY = find(y);
        int rankX = rank[parX];
        int rankY = rank[parY];

        if(rankX == rankY)
        {
            // make anyone parent 
            // increase rank by 1 of any one 
            par[y] = parX;
            rank[parX]++;
        }
        else if(rankX > rankY )
        {
           
            par[y] = parX;
        }
        else 
        {
            par[x] = parY;
            
            
        }
    }
    public static int find(int n )
    {
        if(par[n] == n )
        {
            return n ;
        }
        // path compression
        return par[n]=find(par[n]);

    }
    public static void initialization(int par[] , int rank [])
    {
        for(int i = 0 ; i<par.length ;i++)
        {
            par[i] =i;
        }
        
    }
    
}
