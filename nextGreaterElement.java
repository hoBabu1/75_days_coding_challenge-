import java.util.*;
// next greater element on right side 
public class nextGreaterElement {
    public static void main(String args[])
    {
        
        int arr[] = {6,8,0,1,3};
        int ans[] = new int[arr.length];
        next(arr , ans);
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static void next(int arr[] , int ans[])
    {
        ans[ans.length-1]= -1;
        Stack<Integer> s = new Stack<>();
        s.push(arr.length-1);
        for(int i = arr.length-2 ; i>=0 ; i--)
        {
                while(!s.isEmpty() && arr[i]>arr[s.peek()])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    ans[i]= -1;
                }
                else 
                {
                    ans[i] = arr[s.peek()];
                }
            s.push(i);
        }
    }   
}
