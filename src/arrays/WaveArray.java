//https://www.geeksforgeeks.org/sort-array-wave-form-2/
//https://www.geeksforgeeks.org/problems/wave-array-1587115621/1

//Easy

package arrays;

import java.util.Arrays;

public class WaveArray {

    public static int[] sortInWave(int[] arr) {
        // code here
        int n = arr.length ;
        if (n <= 1) {
            return arr;
        }
        for (int i = 0; i < n-1; i += 2) {
            int temp = arr[i] ;
            arr[i] = arr[i+1] ;
            arr[i+1] = temp ;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {2, 4, 7, 8, 9, 10};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Wave Array: "+Arrays.toString(sortInWave(input1)));
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Wave Array: "+Arrays.toString(sortInWave(input2)));

    }
}

/*Sample Output:
Input array: [1, 2, 3, 4, 5]
Wave Array: [2, 1, 4, 3, 5]

Input array: [2, 4, 7, 8, 9, 10]
Wave Array: [4, 2, 8, 7, 10, 9]
 */