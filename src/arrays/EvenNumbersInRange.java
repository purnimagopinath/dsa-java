/*
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].

First argument A is an array of integers.
Second argument B is a 2D array of integers.
Return an array of integers.
 */

package arrays;

import java.util.Arrays;

public class EvenNumbersInRange {
    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] evenPrefix = new int[n];
        evenPrefix[0] = (A[0]%2==0 ? 1 : 0);
        for(int i=1;i<n;i++){
            if(A[i]%2==0){
                evenPrefix[i] = evenPrefix[i-1]+1;
            }else{
                evenPrefix[i] = evenPrefix[i-1];
            }
        }

        // 1, 2, 3, 4, 5
        // 0, 1, 1, 2, 2

        int m = B.length;
        int[] ans = new int[m];
        for(int i=0;i<m;i++){
            System.out.println("Range is : "+ Arrays.toString(B[i]));
            int left = B[i][0]==0 ? 0 : (evenPrefix[B[i][0]-1]);
            ans[i] = (evenPrefix[B[i][1]])-left;
            System.out.println("No of Even numbers is : "+ ans[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[][] b = {{0,2}, {2,4}, {1,4}};
        int[] input2 = {2, 1, 8, 3, 9, 6};

        System.out.println("Input array: "+ Arrays.toString(input1));
        solve(input1, b);
//        System.out.println("Even numbers in the given ranges: "+Arrays.toString(solve(input1, b)));
        b = new int[][]{{0,3}, {3,5}, {1,3}, {2,4}};
        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Even numbers in the given ranges: "+Arrays.toString(solve(input2, b)));

    }

}

/* Sample Output:

Input array: [1, 2, 3, 4, 5]
Range is : [0, 2]
No of Even numbers is : 1
Range is : [2, 4]
No of Even numbers is : 1
Range is : [1, 4]
No of Even numbers is : 2

Input array: [2, 1, 8, 3, 9, 6]
Range is : [0, 3]
No of Even numbers is : 2
Range is : [3, 5]
No of Even numbers is : 1
Range is : [1, 3]
No of Even numbers is : 1
Range is : [2, 4]
No of Even numbers is : 1
Even numbers in the given ranges: [2, 1, 1, 1]
 */