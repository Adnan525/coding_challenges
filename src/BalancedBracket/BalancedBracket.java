package BalancedBracket;

import java.util.Stack;

public class BalancedBracket {
    public static boolean checkIfBalanced(String str)
    {
        Stack<Character> stack = new Stack();
        for(int i =0; i<=str.length()-1; i++)
        {
            Character temp = str.charAt(i);
            if(temp == '(' || temp == '{' || temp == '[')
            {
                stack.push(temp);
            }
            else
            {
                if(stack.isEmpty())
                    return false;
                else
                {
                    Character popVal = stack.pop();
                    if(temp == ')' && popVal != '(')
                        return false;
                    else if(temp == '}' && popVal != '{')
                        return false;
                    else if(temp == ']' && popVal != '[')
                        return false;
                }
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(checkIfBalanced("{([()])}")); //true
        System.out.println(checkIfBalanced("{([)}")); //false
        System.out.println(checkIfBalanced("())")); //false
        System.out.println(checkIfBalanced("[]")); //true
    }
}
