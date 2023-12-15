/*
https://leetcode.com/problems/happy-number/

  Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
*/
public class HappyNumber {

     
    class Solution {
        public boolean isHappy(int n) {
            
            int slow = n ;
            int fast = n ;
            do
            {
                slow = square(slow);
                if(slow == 1)
                {
                    return true ;
                }
                fast = square(square(fast));
    
            }while(fast != slow );
            return false;
        }
        public int square(int n )
        {
            int sum = 0 ;
            while(n != 0)
            {
                int rem = n%10;
                sum = sum+rem*rem;
                n = n/10;
            }
            return sum;
        }
    }
    
}
