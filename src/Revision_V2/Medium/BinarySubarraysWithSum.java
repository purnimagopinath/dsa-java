package Revision_V2.Medium;

import java.util.Arrays;

//https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return maxOrLessThanSum(nums, goal)-maxOrLessThanSum(nums, goal-1);
    }

    public int maxOrLessThanSum(int[] nums, int goal){
        if(goal<0) return 0;
        int n = nums.length;
        if(n==0) return 0;

        int count = 0;
        int sum = 0;
        int left = 0, right = 0;
        while(right<n){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }

    public static void main(String[] args){
        BinarySubarraysWithSum obj = new BinarySubarraysWithSum();
        int[] nums  = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println("\nInput is "+ Arrays.toString(nums)+"\nGoal is: "+goal);
        System.out.println("Output is "+(obj.numSubarraysWithSum(nums, goal)));

        int[] nums1  = {0, 0, 0, 0, 0};
        goal = 0;
        System.out.println("\nInput is "+ Arrays.toString(nums)+"\nGoal is: "+goal);
        System.out.println("Output is "+(obj.numSubarraysWithSum(nums1, goal)));
    }

}

/*Sample Output:
Input is [1, 0, 1, 0, 1]
Goal is: 2
Output is 4

Input is [1, 0, 1, 0, 1]
Goal is: 0
Output is 15
 */
