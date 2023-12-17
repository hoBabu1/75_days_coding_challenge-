public class N_Queens
{
    public static void main(String args[])
    {
        char arr [][]=new char [4][4];
         for(int i = 0; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr.length;j++)
            {
                arr[i][j]='X';
            }
        }
        
        sol(arr , 0);


    }
    public static boolean isSafe(char arr[][], int row , int col)
    {
        // row check
        for(int i = 0 ; i<arr.length; i++)
        {
            if(arr[row][i]=='Q')
            {
                return false; 
            }
        }
        //col
        for(int i = 0 ; i<arr.length; i++)
        {
            if(arr[i][col]=='Q')
            {
                return false; 
            }
        }
        // daigonally 
        for(int i = row-1 , j= col-1 ; i>=0 && j>=0 ; i--,j--)
        {
                if(arr[i][j]=='Q')
                {
                    return false;
                }   
        }
        for(int i = row-1 , j = col+1 ; i>=0 && j<arr.length ; i--,j++)
        {
                if(arr[i][j]=='Q')
                {
                    return false;
                }
        }
        return true ;
    }
    public static void print(char arr[][])
    {
         for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0 ; j<arr.length ;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
             System.out.println();   
        }
       
    }
    public static void sol(char arr[][], int row )
    {
        // base case 
        if(row == arr.length)
        {
            System.out.println("------");
            print(arr);
            return;
        }
        for(int col =0 ; col<arr.length ; col++)
        {
            if(isSafe(arr , row , col ))
            {
                arr[row][col]= 'Q';
                sol(arr , row+1);
                arr[row][col]= '.';
            } 
        }
    }

}