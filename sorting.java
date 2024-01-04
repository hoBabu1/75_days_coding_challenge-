public class sorting
{
    public static void main(String args[])
    {
        //bubble sort
        int arr[]= {8,9,5,4,7} ;
        bubblesort(arr);
        //selection sorting 
        selectionsort(arr);
        //optimized bubble sort 
        optimizedbubblesort(arr);

    }
    public static void bubblesort(int arr[])
    {
        // number of turns 
        for(int i =0; i<arr.length-1; i++)
        {
            for(int j =0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {    //swapping 
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i =0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    //selection sorting 
    public static void selectionsort(int arr[])
    {
        for(int i = 0 ; i <arr.length-1;i++)
        {
           int  minpos =i;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos = j;
                }
  
            }
            //swap
            int temp = arr[i];
            arr[i]=arr[minpos];
            arr[minpos]= temp;
        }
         for(int i =0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
         public static void optimizedbubblesort(int arr[])
    {
        // number of turns 
        for(int i =0; i<arr.length-1; i++)
        {
            boolean swapped = false ;
            for(int j =0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {    //swapping 
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true ;
                }
            }

            if(swapped == false )
            {
                break;
            }
        }
        for(int i =0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}