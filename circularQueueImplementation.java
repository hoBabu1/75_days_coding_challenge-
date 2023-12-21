public class circularQueueImplementation {
    public static void main(String args[]) throws Exception
    {
        circularQueueImplementation cq = new circularQueueImplementation(5);
        cq.insert(1);
        cq.insert(2);
        cq.insert(5);
        cq.insert(8);
        cq.insert(19);
        cq.display();
        System.out.println(cq.remove());

    }
    int arr[];
    static final int defaultSize = 5 ;
    int end = 0 ;
    int front = 0;
    int size=0;
    public circularQueueImplementation()
    {
        this(defaultSize);

    }
    public circularQueueImplementation(int size)
    {
        this.arr= new int [size];
    }
    public boolean  isEmpty()
    {
        return size == 0;
    }
    public boolean isFull()
    {
        return arr.length == size;
    }
    public void insert(int data) throws Exception
    {
        if(isFull())
        {
            throw new Exception("full ai bhai");
        }
        arr[end++] = data;
        end= end % arr.length;
        size++;
    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("full ai bhai");
        }
       int removed = arr[front++];
       front = front % arr.length;
       size--;
       return removed;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(arr[i] + " -> ");
            i++;
            i %= arr.length;
        } while (i != end);
        System.out.println("END");
    }
    

    
}
