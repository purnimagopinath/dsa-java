package Revision_V2.Medium;

import java.util.Arrays;

//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
public class LongestSubarrayOfOnesAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n<=1) return 0;

        int left = 0, right = 0, zeroCount = 0, maxLength = 0;

        while(right<n){
            if(nums[right]==0) zeroCount++;

            while(zeroCount>1){
                if(nums[left]==0) zeroCount--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left);
            right++;
        }
        return maxLength==n? maxLength-1: maxLength ;

    }
    public static void main(String[] args){
        LongestSubarrayOfOnesAfterDeletingOneElement obj = new LongestSubarrayOfOnesAfterDeletingOneElement();
        int[] nums  = {1, 1, 0, 1};
        System.out.println("\nInput is "+ Arrays.toString(nums));
        System.out.println("Output is "+(obj.longestSubarray(nums)));

        int[] nums1  = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println("\nInput is "+Arrays.toString(nums1));
        System.out.println("Output is "+(obj.longestSubarray(nums1)));

        int[] nums2  = {1, 1, 1};
        System.out.println("\nInput is "+Arrays.toString(nums2));
        System.out.println("Output is "+(obj.longestSubarray(nums2)));
    }
}

/*Sample Output:
Input is [1, 1, 0, 1]
Output is 3

Input is [0, 1, 1, 1, 0, 1, 1, 0, 1]
Output is 5

Input is [1, 1, 1]
Output is 2
 */
