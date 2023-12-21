public class CustomQueue {
    public static void main(String args[]) throws Exception{
        CustomQueue q = new CustomQueue(15);
        q.insert(5);
        q.insert(4);
        q.insert(8);
        q.insert(7);
        q.insert(9);
        q.insert(2);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());


    }
    int arr[];
    static final int defaultSize = 10;
    int end = 0;
    public CustomQueue()
    {
        this(defaultSize);
    }
    public CustomQueue(int size)
    {
        arr = new int[size];
    }
    public boolean isFull()
    {
        return arr.length == end ;
    }
    public boolean isEmpty()
    {
        return end == 0;
    }
    public void insert(int data)
    {
        if(isFull())
        {
            return ;
        }
        else 
        {
            arr[end++] = data;
        }
    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("queue is empty");
        }
        int removed = arr[0];
        // shifting 
        for(int i = 0 ; i<arr.length-1 ; i++)
        {
            arr[i] = arr[i+1];
           
        }
         end--;
        return removed;
    }

    
}
