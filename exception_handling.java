public class exception_handling {
    public static void main(String args[]) 
     {
        int a = 5 ;
        int b = 0 ;
        try{
        divide(a,b);
    }catch(Exception e )
    {
        System.out.println(e.getMessage());
    }
    finally {
        System.out.println("I love You"); // it will always exceute 
    }
     
    }

   public  static int divide(int a , int b ) throws ArithmeticException
    {
        if(b == 0 )
        {
            throw new ArithmeticException("please dont divide it by 0");
        }
        return a/b;
    }
}
