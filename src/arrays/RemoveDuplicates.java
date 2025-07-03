//https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
//https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1

//Easy

package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        // Code Here
        int n = arr.length;
        if (n <= 1) return n;

        int count = 1; // next write position after first element
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count++] = arr[i]; // write unique element at next slot
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] input1 = {2, 2, 2, 2, 2};
        int[] input2 = {1, 2, 4};

        System.out.println("\nInput array: "+ Arrays.toString(input1));
        System.out.println("No. of elements after removing Duplicates is: "+removeDuplicates(input1));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("No. of elements after removing Duplicates is: "+removeDuplicates(input2));


    }
}

/*Simple Output:

Input array: [2, 2, 2, 2, 2]
No. of elements after removing Duplicates is: 1

Input array: [1, 2, 4]
No. of elements after removing Duplicates is: 3

 */