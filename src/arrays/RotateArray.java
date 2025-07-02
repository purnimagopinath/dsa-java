//https://www.geeksforgeeks.org/dsa/array-rotation/
//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

//Easy

package arrays;

import java.util.Arrays;

public class RotateArray {
    static int[] rotateArr(int[] arr, int d) {
        // add your code here
        int n = arr.length;
        if (n <= 1 || d==0){
            return arr;
        }
        while (d >= n) {
            d = d - n;
        }

        int[] temp = new int[d];
        System.arraycopy(arr, 0, temp, 0, d);
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int d = 2;
        int[] input2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] input3 = {7, 3, 9, 1};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("After Rotating array to the left " +d +" times : "+Arrays.toString(rotateArr(input1, d)));
        d = 3;
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("After Rotating array to the left " +d +" times : "+Arrays.toString(rotateArr(input2, d)));
        d = 9;
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("After Rotating array to the left " +d +" times : "+Arrays.toString(rotateArr(input3, d)));

    }
    // Solution used recursion. check that out
    // juggling algorithm and reversal algorithm
}

/*Sample Output:

Input array: [1, 2, 3, 4, 5]
After Rotating array to the left 2 times : [3, 4, 5, 1, 2]

Input array: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
After Rotating array to the left 3 times : [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]

Input array: [7, 3, 9, 1]
After Rotating array to the left 9 times : [3, 9, 1, 7]

 */