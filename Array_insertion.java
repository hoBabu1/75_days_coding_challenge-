public class Array_insertion {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        insert_element(2,arr , 10);
        printArray(arr);

    }
    public static void insert_element(int position , int arr[]  , int value )
    {
        if(valid_index(position , arr))
        {
            for(int i = arr.length-1 ; i>position-1;i--)
            {
                arr[i] = arr[i-1];
            }
            arr[position-1] = value ;
        }
    }
    public static boolean valid_index(int position  , int arr[])
    {
        if(position>=1 && position<= arr.length )
        {
            return true ;
        }
        return false ;
    }
    public static void printArray(int arr[])
    {
        for(int i = 0 ; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}
