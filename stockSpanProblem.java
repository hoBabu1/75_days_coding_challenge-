import java.util.*;
public class stockSpanProblem {
    public static void main(String args[])
    {
        int arr[] = {100,80,60,70,60,85,100};
        System.out.println(span(arr));
 
    }
    public static int span(int arr[])
    {
        if(arr.length == 0 )
        {
            return -1;
        }
        int max = 1 ;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i = 1; i<arr.length ; i++)
        {
                while(!s.isEmpty() && arr[s.peek()]<=arr[i])
                {
                    s.pop();
                    if(!s.isEmpty())
                    {
                        max = Math.max(max,i-s.peek());
                    }
                    else 
                    {
                        max = Math.max(max , i+1);
                    }
                }
                s.push(i);
            }
        return max;
    }
    
}
