/*

 You are given an integer array A.

Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.

Return "YES" if it is possible; otherwise, return "NO" (without quotes).
1 <= |A|, A[i] <= 10^6


Return a string "YES" or "NO" denoting the answer.

 */
package arrays;

import java.util.Arrays;

public class EvenSubarrays {

    public static String solve(int[] A) {
        int n=A.length;
        if(n%2!=0){
            return "NO";
        }
        if((A[0]%2==0)&&(A[n-1]%2==0)){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] input1 = {2, 4, 8, 6};
        int[] input2 = {2, 4, 8, 7, 6};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Can we get atleast one Even Subarray: "+(solve(input1)) );

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Can we get atleast one Even Subarray: "+(solve(input2)) );

    }

}
/*Sample Output:

Input array: [2, 4, 8, 6]
Can we get atleast one Even Subarray: YES

Input array: [2, 4, 8, 7, 6]
Can we get atleast one Even Subarray: NO
 */