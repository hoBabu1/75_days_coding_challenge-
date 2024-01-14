public class disjointSetUnion_Implementation {
   static  int n = 7 ;
       static  int par [] = new int[7];
       static  int rank[] = new int[7];
    
    public static void main(String args[])
    {
        initialization(par , rank);
        union(1,3);
        union(2,4);
        
        union(3,6);
        union(1,4);
        System.out.println(find(4));
        // print(par);
        // print(rank);
    }
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
        for(int i = 0 ; i<par.length ;i++)
        {
            rank[i] =0;
        }
    }
    public static void print(int arr[])
    {
        for(int i = 0 ; i<arr.length ;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
}
