/*

You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

1 <= N <= 105
1 <= Ai <= 10^4
 */
package arrays;

import java.util.Arrays;

public class SumOfAllSubarrays {
    public static long subarraySum(int[] A) {
        long totalSum=0;
        int n=A.length;
        for(int i=0;i<n;i++){
            totalSum += (long)(i+1)*(long)(n-i)*(long)A[i];
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {2, 1, 3};
        int[] input3 = {1, 2, 3, 4};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Sum of all SubArrays is: "+subarraySum(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Sum of all SubArrays is: "+subarraySum(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Sum of all SubArrays is: "+subarraySum(input3) );


    }
}

/* Sample Output:

Input array: [1, 2, 3]
Sum of all SubArrays is: 20

Input array: [2, 1, 3]
Sum of all SubArrays is: 19

Input array: [1, 2, 3, 4]
Sum of all SubArrays is: 50
 */