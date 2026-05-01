package Mock;
/*
Problem:
1. Given a string of digits and a target value, insert the operators +, -, or * between digits
so that the expression evaluates to the target.

Return all valid expressions.

Input: num = "123", target = 6
Output: ["1+2+3", "1*2*3"]
 */

/*
    My assumptions:
    String consists of only digits
    Considering Single digits only
    Every digit can be used only once
    Digits will be considered in the order of their appearance in the string.
    We cannot skip any digit in the equation
    Operations can only be performed after the digit not before(for first element)
    Will return empty arraylist if no match found
    I am converting the given string into an array of integers once before I start generating valid expressions,
    so that I can get away with the integer char conversion for every recursive call

    we start with the first integer automatically as we can only perform the given operations after considering a digit

* */
import java.util.List;
import java.util.ArrayList;

public class ValidExpressions {
    public List<String> allValidExpressions(String s, int target){
        List<String> ans = new ArrayList<>();
        int n = s.length();
        int[] nums = new int[n];
        int idx = 0;
        for(char c:s.toCharArray()){
            nums[idx] = c-'0';
            idx++;
        }

        StringBuilder sb = new StringBuilder();
        generateValidExpressions(nums, target, 1, sb.append(nums[0]), nums[0], ans);
        return ans;
    }

    public void generateValidExpressions(int[] nums, int target, int start, StringBuilder sb, int currentValue, List<String> ans){
        if(currentValue==target && start==nums.length){
            ans.add(sb.toString());
            return;
        }
        if(start>=nums.length) return;

        int len = sb.length();
        //add
        sb.append("+");
        sb.append(nums[start]);
        generateValidExpressions(nums, target, start+1, sb, currentValue+nums[start], ans);
        sb.delete(len,sb.length());
        //subtract
        sb.append("-");
        sb.append(nums[start]);
        generateValidExpressions(nums, target, start+1, sb, currentValue-nums[start], ans);
        sb.delete(len,sb.length());

        //multiply
        sb.append("*");
        sb.append(nums[start]);
        generateValidExpressions(nums, target, start+1, sb, currentValue*nums[start], ans);
        sb.delete(len,sb.length());


    }

    public static void  main(String[] args){
        ValidExpressions obj = new ValidExpressions();
        String s = "123";
        int target = 6;
        System.out.println(obj.allValidExpressions(s,target));


    }


    /*Sample Output
    [1+2+3, 1*2*3]
     */
}
