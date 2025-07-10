//https://leetcode.com/problems/missing-number/description/

//268
//Easy

package BinarySearch;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left=0 , right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] input1 = {3, 0, 1} ;
        System.out.println("\nGiven Array : "+Arrays.toString(input1));
        System.out.println("Missing number in range 0 to n is : "+missingNumber(input1));

        int[] input2 = {0, 1} ;
        System.out.println("\nGiven Array : "+Arrays.toString(input2));
        System.out.println("Missing number in range 0 to n is : "+missingNumber(input2));

        int[] input3 = {9, 6, 4, 2, 3, 5, 7, 0, 1} ;
        System.out.println("\nGiven Array : "+Arrays.toString(input3));
        System.out.println("Missing number in range 0 to n is : "+missingNumber(input3));
    }
}

/*Sample Output:

Given Array : [3, 0, 1]
Missing number in range 0 to n is : 2

Given Array : [0, 1]
Missing number in range 0 to n is : 2

Given Array : [9, 6, 4, 2, 3, 5, 7, 0, 1]
Missing number in range 0 to n is : 8
 */