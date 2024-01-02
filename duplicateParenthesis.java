import java.util.*;
public class duplicateParenthesis {
    public static void main(String args[])
    {
        String str1 = "((a+b)+())";
        System.out.println(isDuplicate(str1));

    }
    public static boolean isDuplicate(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch != ')')
            {
                s.push(ch);
            }
            else 
            {
                int count = 0 ;
                while(!s.isEmpty() && s.pop() != '(')
                {
                    
                    count++;
                }
                if(count == 0)
                {
                    return true;
                }
            }

        }
        return false;
    }
    
}
