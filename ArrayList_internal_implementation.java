public class ArrayList_internal_implementation<T>
{
    private Object data [] ; 
    private static int default_size = 10;
    private int size = 0 ;
    public ArrayList_internal_implementation()
    {
        this.data = new Object[default_size];
    }
    public void add(T num)
    {
        if(isfull())
        {
            resize();
        }
        data[size++] = num;
        

    }
    private boolean isfull()
    {
        return size == data.length;
    }
    private void resize()
    {
        Object temp[] = new Object[2*data.length];
        // copying 
        for(int i = 0 ; i<data.length ; i++)
        {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove()
    {
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index)
    {
        return (T)data[index];
    }
    public int size()
    {
        return size;
    }
    public void  set(int index , T value )
    {
        data[index] = value ;
        
    }
    public static void main(String[] args) {
        ArrayList_internal_implementation<String> list = new ArrayList_internal_implementation<>();
        list.add("hoBabu");

        System.out.println(list.get(0));
        
    }

}