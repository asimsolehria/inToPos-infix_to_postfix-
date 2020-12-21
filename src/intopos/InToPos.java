
package intopos;

import java.util.Stack;

/**
 *
 * @author asim
 */
public class InToPos 
{
    
    
    private int Prec(char op)
    {
        switch(op)
        {
            case '+', '-' -> {
                return 1;
            }
            case '/', '*' -> {
                return 2;
            }
            case '^' -> {
                return 3;
            }
        }
        return -1;
    }
    public String inToPos(String exp)
    {
        Stack<Character> stack=new Stack<>();
        String result="";
        for (int i = 0; i < exp.length(); i++) 
        {
           char c=exp.charAt(i);
           
           if(Character.isLetterOrDigit(c))
               result+=c;
           else if (c=='(')
               stack.push(c);
           else if(c==')')
           {
               while (!stack.isEmpty() && stack.peek()!='(') 
                   result+=stack.pop();
               stack.pop();
           } 
           else
           {
               while(!stack.isEmpty() && Prec(c)<=Prec(stack.peek()))
                   result+=stack.pop();
               stack.push(c);
           }
        }
        return result;
    }
}
