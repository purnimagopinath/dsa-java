/*
You are given an integer array A of size N.

You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

    Remove 3 elements from front and 0 elements from the back, OR
    Remove 2 elements from front and 1 element from the back, OR
    Remove 1 element from front and 2 elements from the back, OR
    Remove 0 elements from front and 3 elements from the back.

1 <= N <= 105

1 <= B <= N

-103 <= A[i] <= 103

Return an integer denoting the maximum possible sum of elements you removed.
 */
package arrays;

import java.util.Arrays;

public class PickFromBothSides {
    public static int solve(int[] A, int B) {
        //Considering Prefix and suffix sum
        int n = A.length;
        int[] suff = new int[n+1];
        suff[n] =0;
        suff[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--) {
            suff[i] = suff[i + 1] + A[i];
        }

        int prefSum = 0;
        int ans = suff[n - B];
        for (int i = 0; i < B; i++) {
            prefSum = prefSum + A[i];
            int suffSum = suff[n - B + (i + 1)];
            ans = Math.max(ans, prefSum + suffSum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = {5, -2, 3, 1, 2};
        int b = 3;
        int[] input2 = {2, 3, -1, 4, 2, 1};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("No of elements to remove: "+b);
        System.out.println("Maximum Possible sum is: "+solve(input1, b));

        b = 4;
        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("No of elements to remove: "+b);
        System.out.println("Maximum Possible sum is: "+solve(input2, b));


    }

}

/*Sample Output:

Input array: [5, -2, 3, 1, 2]
No of elements to remove: 3
Maximum Possible sum is: 8

Input array: [2, 3, -1, 4, 2, 1]
No of elements to remove: 4
Maximum Possible sum is: 9
 */

