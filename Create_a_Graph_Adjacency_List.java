import java.util.*;
public class Create_a_Graph_Adjacency_List
{
    /*  (5)
        0-----1
             / \
            /   \  (3)
           2-----3
           |  (1)
           | (2)
           4
     */
    public static void main(String args[])
    {
        ArrayList<Edge> graph [] = new ArrayList[5]; // null--> empty
        for(int i = 0 ; i<5 ; i++)
        {
           graph[i] = new ArrayList(); 
        }
        // 0 --> vertex
        graph[0].add(new Edge(0,1,5));
        // 1 vertex 
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        // 2 --> vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));
        // 3 --> vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        //4th vertex 
         graph[4].add(new Edge(4,2,2));

         // find a neighbour of 2nd vertex 
         for(int i = 0 ; i<graph[2].size();i++)
         {
            System.out.print(graph[2].get(i).dest+" ");
         }

    }
     public static class Edge 
    {
        int src ;
        int dest ;
        int wt ; 
        public Edge(int src , int dest , int wt )
        {
            this.dest= dest;
            this.src=src;
            this.wt = wt ;
        }
    }
}

/*
  key points --> 
  it is a array of arraylist
  make a new arralist array 
  initialize with new ArrayList<>();
  
  */