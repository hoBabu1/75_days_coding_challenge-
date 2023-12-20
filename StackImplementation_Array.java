public class StackImplementation_Array {
    public static void main(String args[]) throws Exception
    {
        StackImplementation_Array s = new StackImplementation_Array();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        //System.out.println(s.pop());


    }
    int arr[];
    static final int defaultSize = 10 ;
    public StackImplementation_Array(int size )
    {
        this.arr = new int[size];
    }
    public StackImplementation_Array()
    {
        this(defaultSize);
    }
     int ptr = -1;
    public void push(int data)
    {
        if(!isFull())
        {
            ptr++;
            arr[ptr] = data ;
        }
        else
        {
            System.out.println("ArrayIsFull");
        }
    }
    public boolean isFull()
    {
        if(ptr<arr.length)
        {
            return false ;
        }
        return true ;
    }
    public boolean isEmpty()
    {
        return ptr == -1;
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("cannot pop as stack is empty");
        }
        int p = arr[ptr];
        ptr--;
        return p;
    }
    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("cannot peek as stack is empty");
        }
        return arr[ptr];
    }

    
}
