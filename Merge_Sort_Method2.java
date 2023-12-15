import java.util.*;
public class Merge_Sort_Method2 {
    public static void main(String args[])
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        arr=Sort(arr);
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static int[]  Sort(int arr[] )
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int  mid = arr.length/2;
        // left 
       int left[]= Sort(Arrays.copyOfRange(arr , 0 ,mid) );
        // right 
       int right[]= Sort(Arrays.copyOfRange(arr , mid,arr.length) );
        // merge 
        return Merge(left , right);


    }
    public static int[] Merge(int left[] , int right[])
    {
        int ans[] = new int[left.length + right.length];
        int k  = 0;
        int i = 0 ; 
        int j = 0 ; 
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                ans[k++] = left[i++];
            }
            else 
            {
                ans[k++] = right[j++];
            }
        }
        while(i<left.length)
        {
             ans[k++] = left[i++];
        }
        while(j<right.length)
        {
             ans[k++] = right[j++];
        }

        return ans;
    }
    
    
}
