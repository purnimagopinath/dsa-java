/*
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.

1 <= N <= 100
1 <= A[i] <= 10^5

Return a 2D array of integers in any order.
 */
package arrays;

import java.util.Arrays;

public class GeneratingAllSubarrays {
    public static int[][] solve(int[] A) {
        int n = A.length;
        int totalSubarrays = n * (n + 1) / 2;
        int[][] result = new int[totalSubarrays][];
        int index = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++, index++) {
                result[index] = new int[end - start + 1];
                for(int i=start, y=0;i<=end;i++,y++){
                    result[index][y]=A[i];
                }
                System.out.println(Arrays.toString(result[index]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {5, 2, 1, 4};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Generating All Subarrays: ");
        solve(input1);

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Generating All Subarrays: ");
        solve(input2);
    }

}

/* Sample Output:

Input array: [1, 2, 3]
Generating All Subarrays:
[1]
[1, 2]
[1, 2, 3]
[2]
[2, 3]
[3]

Input array: [5, 2, 1, 4]
Generating All Subarrays:
[5]
[5, 2]
[5, 2, 1]
[5, 2, 1, 4]
[2]
[2, 1]
[2, 1, 4]
[1]
[1, 4]
[4]

 */