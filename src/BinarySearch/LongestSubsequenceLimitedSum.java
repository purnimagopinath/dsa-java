//https://leetcode.com/problems/longest-subsequence-with-limited-sum/submissions/1692791481/

//2389
//Easy

package BinarySearch;

import java.util.Arrays;

public class LongestSubsequenceLimitedSum {
    public static int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length ;
        Arrays.sort(nums) ;
        for(int i=1 ; i< n ;i++){
            nums[i] = nums[i-1]+nums[i] ;
        }
        int[] ans = new int[queries.length] ;
        for(int i=0; i< queries.length; i++){
            ans[i] = findMaxSubsequenceLength(nums, queries[i]);
        }
        return ans;
    }

    private static int findMaxSubsequenceLength(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid=lo+(hi - lo)/2;
            if (nums[mid]<=target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] input1= {4, 5, 2, 1};
        int[] input2={3, 10, 21};
        System.out.println("\nInput array: "+ Arrays.toString(input1)+"\n Queries :  "+Arrays.toString(input2));
        System.out.println("Longest Subsequence with the correspondent limited sum : "+Arrays.toString(answerQueries(input1, input2)));

        int[] input3= {2, 3, 4, 5};
        int[] input4={1};
        System.out.println("\nInput array: "+ Arrays.toString(input3)+"\n Queries :  "+Arrays.toString(input4));
        System.out.println("Longest Subsequence with the correspondent limited sum : "+Arrays.toString(answerQueries(input3, input4)));

    }
}
/*Sample Output:

Input array: [4, 5, 2, 1]
 Queries :  [3, 10, 21]
Longest Subsequence with the correspondent limited sum : [2, 3, 4]

Input array: [2, 3, 4, 5]
 Queries :  [1]
Longest Subsequence with the correspondent limited sum : [0]

 */