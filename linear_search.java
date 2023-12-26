public class linear_search
{
    public static void main(String args[])
    {
        int arr[] = {2,3,4,5,6,7,8,9,0};
        int input = 70;
        int ans = search(arr , input);
        System.out.println(ans);
       
    }
    public static int search(int arr[] , int input )
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i] == input)
            {
                return i;
            }
        }
        return -1;
    }
}