/*
  perform a binary search 
  return index 
  if element is not there return -1;
*/ 

public class Binary_Search {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(bin_Search(arr,90));

    }
    public static int bin_Search(int arr[] , int tgt)
    {
        int si = 0 ;
        int ei = arr.length-1;
        while(si<=ei)
        {
            int mid = (si+ei)/2;
            if(arr[mid] == tgt)
            {
                return mid;
            }
            else if(arr[mid]>tgt)
            {
                ei = mid-1;
            }
            else 
            {
                si = mid+1;
            }
        }
        return -1;
    }
    
}
