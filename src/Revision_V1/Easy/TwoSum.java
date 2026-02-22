package Revision_V1.Easy;
//Array

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[0];

    }
    public static void main(String[] args){
        TwoSum obj = new TwoSum();
        int[] input1 = {2, 7, 5 , 11};
        int target = 9;
        System.out.println("\nInput is : "+ Arrays.toString(input1)+"\nTarget: "+target);
        System.out.println("Output:"+ Arrays.toString(obj.twoSum(input1, target)));

        int[] input2 = {3, 2, 4};
        int target2 = 6;

        int[] input3 = {3, 3};
        int target3 = 6;


        System.out.println("\nInput is : "+ Arrays.toString(input2)+"\nTarget: "+target2);
        System.out.println(Arrays.toString(obj.twoSum(input2, target2)));

        System.out.println("\nInput is : "+ Arrays.toString(input3)+"\nTarget: "+target3);
        System.out.println(Arrays.toString(obj.twoSum(input3, target3)));
    }
}


/*Sample Output:

Input is : [2, 7, 5, 11]
Target: 9
Output:[0, 1]

Input is : [3, 2, 4]
Target: 6
[1, 2]

Input is : [3, 3]
Target: 6
[0, 1]


 */