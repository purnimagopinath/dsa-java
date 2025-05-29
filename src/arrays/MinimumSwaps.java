/*

Given an array of integers A and an integer B,
find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.
Return the minimum number of swaps.

 */
package arrays;

import java.util.Arrays;

public class MinimumSwaps {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int targetElements = 0;
        for (int num : A) {
            if(num<=B) {
                targetElements++;
            }
        }
        int numsPresent =0;
        for(int i=0;i<targetElements;i++) {
            if(A[i]<=B) {
                numsPresent++;
            }
        }
        int minSwaps = targetElements-numsPresent;

        for(int i=targetElements;i<n;i++) {
            if(A[i-targetElements]<=B) {
                numsPresent--;
            }
            if(A[i]<=B) {
                numsPresent++;
            }
            minSwaps = Math.min(minSwaps, targetElements-numsPresent);
        }
        return minSwaps;
    }
    public static void main(String[] args) {
        int[] input1 = {1, 12, 10, 3, 14, 10, 5};
        int[] input2 = {5, 17, 100, 11};

        int b=8;
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Number to consider <=: "+b);
        System.out.println("Minimum Swaps Required: "+solve(input1, b) );
        b=20;
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Number to consider <=: "+b);
        System.out.println("Minimum Swaps Required: "+solve(input2, b) );

    }
}
/* Sample Output:

Input array: [1, 12, 10, 3, 14, 10, 5]
Number to consider <=: 8
Minimum Swaps Required: 2

Input array: [5, 17, 100, 11]
Number to consider <=: 20
Minimum Swaps Required: 1
 */