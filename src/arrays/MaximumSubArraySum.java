// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1


package arrays;

import java.util.Arrays;

public class MaximumSubArraySum {

    static int getMaxSubarraysum(int[] arr){
        int n=arr.length;
        int maxSum= arr[0];
        int currSum = arr[0];
        int sumAll = arr[0];
        for(int i=1;i<n;i++){
            if((currSum+arr[i])>=maxSum){
                currSum = arr[i]+currSum;
                maxSum = currSum;
            }else{
                currSum  =arr[i];
            }
            sumAll = sumAll+arr[i];
        }
        return Math.max(maxSum, sumAll);
    }

    public static void main(String[] args) {
        int[] input1 = {2, 3, -8, 7, -1, 2, 3};
        int[] input2 = {-2, -4};
        int[] input3 = {5, 4, 1, 7, 8};
        int[] input4 = {1, 2, 3, -2, 5};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input3) );
        System.out.println("\nInput array: "+Arrays.toString(input4));
        System.out.println("Maximum SubArray Sum is: "+getMaxSubarraysum(input4) );

    }

    //Dont have a good feeling about this. Need to revisit with more examples.
    // Should calculate All SubArrays and then their sum
    // int[] input4 = {-79, -68, -18, -58, 25, 52, -68, -30, 6, 10};
    //Expected is 77 but this code returns 16 :D
    //what is Kadane's Algorithm?
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

 */
