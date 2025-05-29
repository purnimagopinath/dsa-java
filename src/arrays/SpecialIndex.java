/*

Given an array, arr[] of size N, the task is to find the count of array indices such that
removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

1 <= N <= 10^5
-105 <= A[i] <= 10^5
Sum of all elements of A <= 10^9

Return the count of array indices such that
removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 */
package arrays;

import java.util.Arrays;

public class SpecialIndex {
    public static int solve(int[] A) {
        int n = A.length;
        int evenSum = 0, oddSum = 0;
        int parsedEvenSum = 0, parsedOddSum = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += A[i];
            } else {
                oddSum += A[i];
            }
        }


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum -= A[i];
            } else {
                oddSum -= A[i];
            }

            if (parsedEvenSum + oddSum == parsedOddSum + evenSum) {
                result++;
            }

            if (i % 2 == 0) {
                parsedEvenSum += A[i];
            } else {
                parsedOddSum += A[i];
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] input1 = {2, 1, 6, 4};
        int[] input2 = {1, 1, 1};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("No of elements can be removed is: "+solve(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("No of elements can be removed is: "+solve(input2) );

    }
}
/*Sample Output:
Input array: [2, 1, 6, 4]
No of elements can be removed is: 1

Input array: [1, 1, 1]
No of elements can be removed is: 3

 */