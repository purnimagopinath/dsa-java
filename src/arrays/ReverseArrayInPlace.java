/*
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.

 */
package arrays;

import java.util.Arrays;

public class ReverseArrayInPlace {
    static int[] getReversedArray(int[] A) {
        int n = A.length;
        if(n==1){
            return A;
        }
        for (int i = 0; i < n/2; i++) {

            int temp = A[i];
            A[i] = A[n-1-i];
            A[n-1-i] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 2, 1};
        int[] input2 = {1, 1, 10};
        int[] input3 = {1, 1, 10, 3, 4, 5, 6, 2};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("After Reversing array : "+Arrays.toString(getReversedArray(input1)));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("After Reversing array : "+Arrays.toString(getReversedArray(input2)));

        System.out.println("\nInput array: "+ Arrays.toString(input3));
        System.out.println("After Reversing array : "+Arrays.toString(getReversedArray(input3)));
    }


}
/* Sample Output:
Input array: [1, 2, 3, 2, 1]
After Reversing array : [1, 2, 3, 2, 1]

Input array: [1, 1, 10]
After Reversing array : [10, 1, 1]

Input array: [1, 1, 10, 3, 4, 5, 6, 2]
After Reversing array : [2, 6, 5, 4, 3, 10, 1, 1]
 */

