/*You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.
1 <= A <= 103
1 <= B <= 109
1 <= C[i] <= 106

Return a single integer which denotes the maximum sum.

 */
package arrays;

import java.util.Arrays;

public class MaximumSubarray {

    public static int maxSubarray(int A, int B, int[] C) {
        int n = C.length;
        int left = 0;
        int maxSum = 0;
        int currentSum = 0;

        for (int right = 0; right < n; right++) {
            currentSum += C[right];

            // Shrink the window from the left if the current sum exceeds B
            while (currentSum > B && left <= right) {
                currentSum -= C[left];
                left++;
            }

            // Update maxSum if the current sum is within the limit
            if (currentSum <= B) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int[] input1 = {2, 1, 3, 4, 5};
        int b=12;
        int[] input2 = {2, 2, 2};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Sum not to exceed: "+b);
        System.out.println("Max Subarray sum within the limit is: "+maxSubarray(input1.length, b, input1));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        b = 1;
        System.out.println("Sum not to exceed: "+b);
        System.out.println("Max Subarray sum within the limit is : "+maxSubarray(input2.length, b, input2));


    }
}
/*Sample Output:

Input array: [2, 1, 3, 4, 5]
Sum not to exceed: 12
Max Subarray sum within the limit is: 12

Input array: [2, 2, 2]
Sum not to exceed: 1
Max Subarray sum within the limit is : 0
 */