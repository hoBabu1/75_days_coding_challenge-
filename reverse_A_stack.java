import java.util.*;
public class reverse_A_stack {
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        reverse(s);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }
    public static void reverse(Stack<Integer> s )
    {
        if(s.isEmpty())
        {
            return;
        }
        int remove = s.pop();
        reverse(s);
        pushAtBottom(s , remove);
        
    }
    public static void pushAtBottom(Stack<Integer> s , int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int remove = s.pop();
        pushAtBottom(s , data);
        s.push(remove);
    } 
}
