/*
You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all odd indices in the range A[B[i][0]…B[i][1]].

 */
package arrays;

import java.util.Arrays;

public class SumOfOddIndices {
    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = 0;

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + ((i % 2 != 0) ? A[i] : 0);
        }

        int m = B.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int startI = B[i][0];
            int endI = B[i][1];
            System.out.println("Subarray index: "+ Arrays.toString(B[i]));
            if (startI == 0) {
                result[i] = prefixSum[endI];
            } else {
                result[i] = prefixSum[endI] - prefixSum[startI - 1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[][] ranges = {{0,2},{1,4}};
        int[] input2 = {2,1,8,3,9};


        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Sum of Odd Indices is: "+Arrays.toString(solve(input1, ranges)) );

        ranges = new int[][]{{0,3},{2,4}};
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Sum of Odd Indices is: "+Arrays.toString(solve(input2, ranges)));

    }
}
