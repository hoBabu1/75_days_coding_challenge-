import java.util.*;
public class stockSpanProblem2 {
    public static void main(String args[])
    {
        int arr[] = {100,80,60,70,60,85,100};
        int span[] = new int[arr.length];
        System.out.println(span(arr,span));
        for(int i = 0 ; i<span.length ; i++)
        {
            System.out.print(span[i]+" ");
        }
    }
    public static int span(int arr[] , int span[])
    {
        span[0] = 1;
        if(arr.length == 0 )
        {
            return -1;
        }
        int max = 1 ;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i = 1; i<arr.length ; i++)
        {
            int count = 1;
                while(!s.isEmpty() && arr[s.peek()]<=arr[i])
                {
                    s.pop();
                    if(!s.isEmpty())
                    {
                        count = i-s.peek();
                        max = Math.max(max,i-s.peek());
                    }
                    else 
                    {
                        count = i+1;
                        max = Math.max(max , i+1);
                    }
                }
                span[i] = count;
                s.push(i);
            }
        return max;
    }
    
}
