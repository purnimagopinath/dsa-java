/*
Given an array A of size N, find the subarray of size B with the least average.

1 <= B <= N <= 10^5
-105 <= A[i] <= 10^5

Return the index of the first element of the subarray of size B that has least average.
Array indexing starts from 0.
 */
package arrays;

import java.util.Arrays;

public class SubarrayWithLeastAverage {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int currentSum = 0;
        int startIndex = 0;


        for (int i = 0; i < B; i++) {
            currentSum += A[i];
        }
        int minSum = currentSum;

        // Slide the window across the array
        for (int i = B; i < n; i++) {
            currentSum += A[i] - A[i - B];
            if (currentSum < minSum) {
                minSum = currentSum;
                startIndex = i - B + 1;
            }
        }

        return startIndex;

    }

    public static void main(String[] args) {
        int[] input1 = {3, 7, 90, 20, 10, 50, 40};
        int b=3;
        int[] input2 = {3, 7, 5, 20, -10, 0, 12};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("SubArray Size: "+b);
        System.out.println("Index of the first element of the subarray of size that has least average is: "+solve(input1, b));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        b = 2;
        System.out.println("SubArray Size: "+b);
        System.out.println("Index of the first element of the subarray of size that has least average is : "+solve(input2, b));


    }
}
/*Sample Output:

Input array: [3, 7, 90, 20, 10, 50, 40]
SubArray Size: 3
Index of the first element of the subarray of size that has least average is: 3

Input array: [3, 7, 5, 20, -10, 0, 12]
SubArray Size: 2
Index of the first element of the subarray of size that has least average is : 4
 */