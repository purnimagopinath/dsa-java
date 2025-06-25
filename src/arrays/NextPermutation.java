//https://www.geeksforgeeks.org/dsa/next-permutation/

//https://www.geeksforgeeks.org/problems/next-permutation5226/1


package arrays;

import java.util.Arrays;

public class NextPermutation {
    static int[] nextPermutation(int[] arr) {
        int n = arr.length;
        int point = n - 2;

        while (point >= 0 && arr[point] >= arr[point + 1]) {
            point--;
        }

        if (point >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[point]) {
                j--;
            }
            int temp = arr[j];
            arr[j] = arr[point];
            arr[point] = temp;
        }

        reverse(arr, point + 1, n - 1);
        return arr;
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }
    }


    public static void main(String[] args){
        int[] input1 = {2, 4, 1, 7, 5, 0};
        int[] input2={3, 2, 1};
        int[] input3 = {3, 4, 2, 5, 1};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Next Permutation is: "+Arrays.toString(nextPermutation(input1)));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Next Permutation is: "+Arrays.toString(nextPermutation(input2)));

        System.out.println("\nInput array: "+ Arrays.toString(input3));
        System.out.println("Next Permutation is: "+Arrays.toString(nextPermutation(input3)));

    }
}

/*Sample Output:

Input array: [2, 4, 1, 7, 5, 0]
Next Permutation is: [2, 4, 5, 0, 1, 7]

Input array: [3, 2, 1]
Next Permutation is: [1, 2, 3]

Input array: [3, 4, 2, 5, 1]
Next Permutation is: [3, 4, 5, 1, 2]
 */