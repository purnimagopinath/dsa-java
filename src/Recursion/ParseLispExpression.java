//736
//HArd
//https://leetcode.com/problems/parse-lisp-expression/description/?envType=problem-list-v2&envId=recursion

package Recursion;

import java.util.*;

public class ParseLispExpression {
    public static int evaluate(String expression) {
        Stack<String> stack = new Stack<>();
        stack.push(expression);
        return evalStack(stack, new HashMap<>());
    }

    private static int evalStack(Stack<String> stack, Map<String,Integer> hash){
        String s = stack.pop().trim();
        //42, -54
        if(s.charAt(0)!='('){
            if(Character.isDigit(s.charAt(0)) || s.charAt(0)=='-'){
                return Integer.parseInt(s);
            }
            return hash.get(s);
        }

        String inner = s.substring(1, s.length()-1).trim();
        int firstSpace = inner.indexOf(' ');
        String op = inner.substring(0,firstSpace);
        String rest = inner.substring(firstSpace+1);
        List<String> tokens = split(rest);

        if (op.equals("add") || op.equals("mult")) {
            stack.push(tokens.get(1));
            stack.push(tokens.get(0));
            int a = evalStack(stack, new HashMap<>(hash));
            int b = evalStack(stack, new HashMap<>(hash));
            return op.equals("add") ? a + b : a * b;
        }

        Map<String, Integer> newHash = new HashMap<>(hash);
        int i = 0, n = tokens.size();
        while (i<n-1) {
            String var = tokens.get(i++);
            String valExpr = tokens.get(i++);
            stack.push(valExpr);
            newHash.put(var, evalStack(stack, newHash));
        }
        stack.push(tokens.get(n - 1));
        return evalStack(stack, newHash);
    }


    private static List<String> split(String s){
        List<String> str = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                open++;
            }
            if(c==')'){
                open--;
            }
            if(open==0 && c==' '){
                str.add(sb.toString());
                sb.setLength(0);
            }else{
                sb.append(c);
            }
        }
        str.add(sb.toString());
        return str;
    }

    public static void main(String[] args){
        String s="(let x 2 (mult x (let x 3 y 4 (add x y))))";
        System.out.println("\nGiven string : "+s);
        System.out.println("After Parsing this, the value is  :"+evaluate(s));

        s="(let x 3 x 2 x)";
        System.out.println("\nGiven string : "+s);
        System.out.println("After Parsing this, the value is  :"+evaluate(s));

        s="(let x 1 y 2 x (add x y) (add x y))";
        System.out.println("\nGiven string : "+s);
        System.out.println("After Parsing this, the value is  :"+evaluate(s));
    }
}



/*Sample Output:

Given string : (let x 2 (mult x (let x 3 y 4 (add x y))))
After Parsing this, the value is  :14

Given string : (let x 3 x 2 x)
After Parsing this, the value is  :2

Given string : (let x 1 y 2 x (add x y) (add x y))
After Parsing this, the value is  :5


 */