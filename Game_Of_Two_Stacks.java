import java.util.*;
public class Game_Of_Two_Stacks {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s2.push(9);
        s2.push(8);
        s2.push(7);
        s2.push(6);
        System.out.println(highestMove(s1 , s2));
        
        
    }
    public static int highestMove(Stack<Integer> s1  ,Stack<Integer> s2  )
    {
        int maxSum = 120 ; 
        int count = 0 ;
        int currSum = 0 ;
        while(!s1.isEmpty() && !s2.isEmpty())
        {
            if(s1.peek()<=s2.peek())
            {
                int curr = s1.pop();
                if(curr+currSum<=maxSum)
                {
                    currSum = currSum+curr;
                    count++;
                }
            }
            else 
            {
                int curr = s2.pop();
                if(curr+currSum<=maxSum)
                {
                    currSum = currSum+curr;
                    count++;
                }
            }
            while(!s1.isEmpty())
            {
                int curr = s1.peek();
                if(curr + currSum <= maxSum)
                {
                    currSum+=curr;
                    s1.pop();
                    count++;
                }
                else 
                {
                    break;
                }
            }
            while(!s2.isEmpty())
            {
                int curr = s2.peek();
                if(curr + currSum <=maxSum)
                {
                    currSum+=curr;
                    s2.pop();
                    count++;
                }
                else 
                {
                    break;
                }
            }
        }
        return count;
    }
    
}
