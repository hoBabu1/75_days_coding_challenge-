/*
    https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
*/
import java.util.Stack;

class MinimumAddtoMakeParenthesesValid
{
    public int minAddToMakeValid(String s) {
        // opening 
        Stack<Character> stack1 = new Stack<>();
        // if opning is empty add in second stack
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                stack1.push(ch);
            }
            else 
            {
                if(stack1.isEmpty())
                {
                    stack2.push(ch);
                }
                else 
                {
                    stack1.pop();
                }
            }

        }
        int count = 0 ;
        while(!stack1.isEmpty())
        {
            stack1.pop();
            count++;
        }
        while(!stack2.isEmpty())
        {
            stack2.pop();
            count++;
        }
        return count;

        
    }
}