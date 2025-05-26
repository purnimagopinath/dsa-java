/*
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Return an integer array of length M where ith element is the answer for ith query in B.

 */
package arrays;

import java.util.Arrays;

public class RangeSum {

    public static long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        long[] pref = new long[n + 1];
        pref[0] = A[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + A[i];   // Sum from the 0th to the i-th index
        }
        long[] ans = new long[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Ranges provided: "+Arrays.toString(B[i]));
            ans[i] = pref[B[i][1]] - (B[i][0] > 0 ? pref[B[i][0] - 1] : 0);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[][] b = {{0,3}, {1,2}};
        int[] input2 = {2, 2, 2};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Sum of elements in the given ranges: "+Arrays.toString(rangeSum(input1, b)));
        b = new int[][]{{0,0}, {1,2}};
        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Sum of elements in the given ranges: "+Arrays.toString(rangeSum(input2, b)));

    }
}
/*Sample Output:
Input array: [1, 2, 3, 4, 5]
Ranges provided: [0, 3]
Ranges provided: [1, 2]
Sum of elements in the given ranges: [10, 5]

Input array: [2, 2, 2]
Ranges provided: [0, 0]
Ranges provided: [1, 2]
Sum of elements in the given ranges: [2, 4]
 */