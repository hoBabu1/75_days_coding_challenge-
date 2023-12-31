public class Pattern
{
    public static void main(String args[])
    {
        int spacecount = 0 ;
        for(int i = 3; i>=1; i--)
        {
           for(int j = 1 ; j<=spacecount ; j++)
           {
            System.out.print(" ");
           }
           for(int k = i ; k>=1; k--)
           {
            System.out.print(k+"");
           }
           spacecount++;
           System.out.println("");
        }

    }
}