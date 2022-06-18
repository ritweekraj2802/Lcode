// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class Solution {
    // A utility function to return precedence 
    // of a given operator
    // Higher the returned value means 
    // higher the precedence
    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;
        
            case '*':
            case '/':
                return 2;
        
            case '^':
                return 3;
        }
        
        return -1;
    }

    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
         // initializing empty String for result
        String result = new String("");
        
        // initializing empty stack
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
            
            // If the scanned character is an operand, 
            // add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
            
            // If the scanned character is an '(', 
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
            
            // If the scanned character is an ')', 
            // pop and output from the stack 
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                
                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression             
                else
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
    
        }
    
        // pop all the operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();
    
        return result;

    }
}