package Exercice;

import java.util.Stack;

/**
 * Created by Aurel on 5/31/17.
 */
public class BalancedBracket {
    /*public boolean isBalanced(String expression) {
        char[] ar = expression.toCharArray();
        boolean isBalanced = true;
        int length = expression.length();
        if (expression == null)
            return false;
        if (expression.length() % 2 != 0)
            return false;
        if (expression.equals(""))
           return true;

        int i = 0;
        int found = -1;

        if(!expression.equals("")) {
            if (ar[i] == '[') {
                found = expression.indexOf(']');
                if (found == -1) {
                    isBalanced = false;
                } else {
                    if (expression.charAt(i + 1) == ']') {
                        isBalanced = isBalanced(expression.substring(i + 2, length));
                    }
                    else if (expression.charAt(length-1-i) == ']')
                        isBalanced = isBalanced(expression.substring(i + 1, length-1-i));
                    else {
                        boolean res1 = isBalanced(expression.substring(i+1, found));
                        boolean res2 = isBalanced(expression.substring(found+1, length));
                        isBalanced = res1 && res2;
                    }
                }
            } else if (ar[i] == '(') {
                found = expression.indexOf(')');
                if (found == -1) {
                    return false;
                } else {
                    if (expression.charAt(i + 1) == ')') {
                        isBalanced = isBalanced(expression.substring(i + 2, length));
                    } else if (expression.charAt(length-1-i) == ')')
                        isBalanced = isBalanced(expression.substring(i + 1, length-1-i));
                    else {
                        boolean res1 = isBalanced(expression.substring(i+1, found));
                        boolean res2 = isBalanced(expression.substring(found+1, length));
                        isBalanced = res1 && res2;

                    }
                }
            } else if (ar[i] == '{') {
                found = expression.indexOf('}');
                if (found == -1) {
                    isBalanced = false;
                } else {
                    if (expression.charAt(i + 1) == '}') {
                        isBalanced = isBalanced(expression.substring(i + 2, length));
                    } else if (expression.charAt(length-1-i) == '}')
                        isBalanced = isBalanced(expression.substring(i + 1, length-1-i));
                    else {
                        boolean res1 = isBalanced(expression.substring(i+1, found));
                        boolean res2 = isBalanced(expression.substring(found+1, length));
                        isBalanced = res1 && res2;
                    }
                }
            } else
                isBalanced = false;
        }


        return isBalanced;
    }*/

    public boolean isBalanced(String expression){
        if ((expression.length() & 1) == 1) return false;
        else {
            char[] brackets = expression.toCharArray();
            Stack<Character> s = new Stack<>();
            for (char bracket : brackets)
                switch (bracket) {
                    case '{': s.push('}'); break;
                    case '(': s.push(')'); break;
                    case '[': s.push(']'); break;
                    default :
                        if (s.empty() || bracket != s.peek())
                            return false;
                        s.pop();
                }
            return s.empty();
        }
    }
}
