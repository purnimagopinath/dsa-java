// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

//Kadane's Algorithm?
package arrays;

import java.util.Arrays;

public class MaximumSubArraySum {

    static int getMaxSubarraysum(int[] arr){
        // Your code here
        int maxSum = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(currentMax + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] input1 = {2, 3, -8, 7, -1, 2, 3};
        int[] input2 = {-2, -4};
        int[] input3 = {5, 4, 1, 7, 8};
        int[] input4 = {1, 2, 3, -2, 5};
        int[] input5 = {-79, -68, -18, -58, 25, 52, -68, -30, 6, 10};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input3) );
        System.out.println("\nInput array: "+Arrays.toString(input4));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input4) );
        System.out.println("\nInput array: "+Arrays.toString(input5));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input5) );

    }

}

/*Sample Output:
Input array: [2, 3, -8, 7, -1, 2, 3]
Maximum SubArray Sum is: 11

Input array: [-2, -4]
Maximum SubArray Sum is: -2

Input array: [5, 4, 1, 7, 8]
Maximum SubArray Sum is: 25

Input array: [1, 2, 3, -2, 5]
Maximum SubArray Sum is: 9

Input array: [-79, -68, -18, -58, 25, 52, -68, -30, 6, 10]
Maximum SubArray Sum is: 77

 */
