//https://leetcode.com/problems/parsing-a-boolean-expression/description/?envType=problem-list-v2&envId=recursion

//1106

//Hard

package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParsingABooleanExpression {
    private static char solveOp(char op, List<Character> values) {
        if (op == '!')
            return values.get(0) == 't' ? 'f' : 't';
        if (op == '&')
            return values.stream().allMatch(ch -> ch == 't') ? 't' : 'f';
        if (op == '|')
            return values.stream().anyMatch(ch -> ch == 't') ? 't' : 'f';

        return 't';
    }

    public static boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        int n = expression.length();

        for (int i = 0; i < n; i++) {
            char c = expression.charAt(i);
            if (c == ',') continue;

            if (c == ')') {
                List<Character> values = new ArrayList<>();
                while (stack.peek() != '(') {
                    values.add(stack.pop());
                }
                stack.pop();
                char op = stack.pop();
                stack.push(solveOp(op, values));
            } else {
                stack.push(c);
            }
        }
        return stack.peek() == 't';
    }

    public static void main(String[] args){
        String s="&(|(f))";
        System.out.println("\nGiven Expression : "+s);
        System.out.println("Result after evaluating the expression : "+parseBoolExpr(s));

        s="|(f,f,f,t)";
        System.out.println("\nGiven Expression : "+s);
        System.out.println("Result after evaluating the expression : "+parseBoolExpr(s));

        s="!(&(f,t))";
        System.out.println("\nGiven Expression : "+s);
        System.out.println("Result after evaluating the expression : "+parseBoolExpr(s));

    }
}


/*Sample Output:

Given Expression : &(|(f))
Result after evaluating the expression : false

Given Expression : |(f,f,f,t)
Result after evaluating the expression : true

Given Expression : !(&(f,t))
Result after evaluating the expression : true
 */