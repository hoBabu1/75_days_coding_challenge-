public class Merge_Sort {
    public static void main(String args[])
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        Sort(arr , 0 , arr.length-1);
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void  Sort(int arr[] , int si  , int ei)
    {
        if(si==ei)
        {
            return;
        }
        int  mid = (si + ei)/2;
        // left 
        Sort(arr , si, mid);
        // right 
        Sort(arr , mid+1 , ei);
        // merge 
        Merge(arr , si , ei , mid);


    }
    public static void Merge(int arr [] , int si , int ei , int mid)
    {
        int k = 0 ; // to track temp array 
        int temp [] = new int [ei-si+1];
        // starting of another array 
        int j = mid+1;
        int i = si ;
        while(i<= mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]= arr[i];
                k++;
                i++;
            }
            else 
            {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i <= mid )
        {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j <= ei)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        // copying array 
        for(int l = 0 ; l<temp.length ;l++)
        {
            arr[si]=temp[l];
            si++;
        }
    }
    
}
