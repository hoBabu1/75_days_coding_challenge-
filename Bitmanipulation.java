import java.util.*;

public class Bitmanipulation
{
    public static void main(String args[])
    {
        // calling function for even and odd 
         OddorEven(5);
         //  calling bit to get the ith bit 
         getibit(5,2);
         // calling function to set ith  bit 
        int newbit =  setithbit(5,1);
        System.out.println(newbit);

        // calling function to clear ith bit 
        clearibit(10,1);
        // update ith bit 
        
        updateithbit(5,1,1);
        // update ith bit by second method 
        updateithbit2(5,1,1);

        // clear ith bits 
        clearlastibits(15,2);
        // clear range in bits 
        clearlastibits(10,2,4);
        // count set bits
        countsetbits(5);
    }

    // function to check wether the given number is odd or even by using bit manipulation

    public static void OddorEven(int n )
    {
        int bitmask = 1;
        if((n & bitmask ) != 0 )
        {
            System.out.println("enetered number is odd");
        }
        else 
        {
             System.out.println("enetered number is even");
        }
    }

    // get the ith bit 

    public static void getibit(int n , int position  )
    {
         int bitmask = 1<<position;
         if((bitmask & n )== 0)
         {
            System.out.println("bit is 0 ");
         }
         else 
         {
            System.out.println("bit is 1");
         }
    }

    // set the ith bit 

    public static int  setithbit(int n , int position )
    {
        int bitmask = 1<<position;
        int newbit = bitmask | n ;
        System.out.println(newbit);
        return newbit;
    }

 // clear the ith bit 
     public static int clearibit(int n , int position)
     {
        int bitmask = ~(1<<position);
        int newbit = bitmask & n ;
        System.out.println(newbit);
        return newbit;
     }
     // update ith bit 
     public static void updateithbit(int n , int position, int newbit)
     {
        if(newbit== 0)
        {
            clearibit(n ,position );
        }
        else 
        {
            setithbit(n ,position);
        }
     }

     // update ith bit by other method 
      public static void updateithbit2(int n , int position, int newbit)
      {
         int n2 = clearibit(n , position);
        int bitmask = (1<<position);
        int n3 = n2 | bitmask;
        System.out.println("update ith bit by 2nd method "+n3);


      }
      // clear last i bits 
      public static void clearlastibits (int n , int position)
      {
        int newbitmask = ~(0)<<position;
        int n2 = n & newbitmask;
        System.out.println(n2);
      }

      // clear range of ibits 
      public static void clearlastibits (int n , int i , int j )
      {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int final1 = (a|b)&n;
         System.out.println(final1);
      }
         // count set bits 
         public static void countsetbits(int n  )
         {
            int count = 0;
            
            while(n>0)
            {
                if((n & 1 )!= 0)
                {
                    count++;
                }
               n=n>>1 ;
            }
            System.out.println(count);
         }
}