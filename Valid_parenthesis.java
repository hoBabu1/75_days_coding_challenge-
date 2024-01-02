class Valid_parenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '[')
            {
                stack.push(curr);
            }
            else 
            {
                if(stack.isEmpty())
                  {
                    return false ;
                  }
               else 
                {
                   char remvoved=  stack.pop();
                   if(curr == ')' && remvoved != '(')
                   {
                       return false ;
                   }
                   else  if(curr == '}' && remvoved != '{')
                   {
                       return false ;
                   }
                   else  if(curr == ']' && remvoved != '[')
                   {
                       return false ;
                   }

                }

            }
        }
        if(stack.isEmpty())
        {
            return true ;
        }
        else 
        {
            return false;
        }
        
    }
}