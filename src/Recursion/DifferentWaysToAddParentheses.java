//https://leetcode.com/problems/different-ways-to-add-parentheses/description/?envType=problem-list-v2&envId=recursion

//241

//Medium

package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentWaysToAddParentheses {
    public static List<Integer> diffWaysToCompute(String expression) {
        return ways(expression, new HashMap<>());
    }
    private static List<Integer> ways(String s, Map<String,List<Integer>> memo) {
        if (memo.containsKey(s)){
            return memo.get(s);
        }
        List<Integer> res = new ArrayList<>();
        boolean isNumber = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c== '+'|| c=='-' || c=='*') {
                isNumber = false ;
                List<Integer> leftResults = ways(s.substring(0,i), memo);
                List<Integer> rightResults = ways(s.substring(i+1), memo);
                for (int a : leftResults)
                    for (int b : rightResults) {
                        if (c == '+') {
                            res.add(a + b);
                        } else if (c == '-') {
                            res.add(a - b);
                        } else { // c == '*'
                            res.add(a * b);
                        }
                    }
            }
        }
        if (isNumber) {
            res.add(Integer.parseInt(s));
        }
        memo.put(s, res);
        return res;
    }

    public static void main(String[] args){
        String s = "2-1-1" ;
        System.out.println("\nGiven String: "+s);
        System.out.println("possible results from computing all the different possible ways to group numbers and operators :"+diffWaysToCompute(s));
        s = "2*3-4*5";
        System.out.println("\nGiven String: "+s);
        System.out.println("possible results from computing all the different possible ways to group numbers and operators :"+diffWaysToCompute(s));
    }
}

/*Sample output:

Given String: 2-1-1
possible results from computing all the different possible ways to group numbers and operators :[2, 0]

Given String: 2*3-4*5
possible results from computing all the different possible ways to group numbers and operators :[-34, -10, -14, -10, 10]

 */
