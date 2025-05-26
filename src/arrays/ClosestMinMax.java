/*
 Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.

Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
 */
package arrays;

import java.util.Arrays;

public class ClosestMinMax {
    public static int solve(int[] A) {
        // lets find min and max of array first
        int min = A[0];
        int max = A[0];
        //Considering that an array can have only 1 value which here we will consider both as min and max
        //[8,8,8,8]

        for(int ele:A){
            max = Math.max(ele, max);
            min = Math.min(ele, min);
        }

        int minIndex = -1;
        int maxIndex = -1;
        int ans=A.length;
        //Unlike ruby -1 is invalid assignment
        for(int i=0 ; i<A.length ; i++){
            if(A[i] == min) minIndex = Math.max(minIndex, i);
            if(A[i] == max) maxIndex = Math.max(maxIndex, i);

            if(minIndex != -1 && maxIndex != -1){
                int len = Math.abs(maxIndex - minIndex) + 1;
                ans = Math.min(ans, len);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 3, 2};
        int[] input2 = {2, 6, 1, 6, 9};
        int[] input3 = {2, 2, 2, 2, 2};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Closest Min Max Subarray Length is: "+solve(input1) );

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Closest Min Max Subarray Length is: "+solve(input2) );

        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Closest Min Max Subarray Length is: "+solve(input3) );

    }


}

/* Sample Output:
Input array: [1, 3, 2]
Closest Min Max Subarray Length is: 2

Input array: [2, 6, 1, 6, 9]
Closest Min Max Subarray Length is: 3

Input array: [2, 2, 2, 2, 2]
Closest Min Max Subarray Length is: 1
 */
