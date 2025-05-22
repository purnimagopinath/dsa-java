//https://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size/

// https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1


package arrays;

import java.util.Arrays;

public class ReverseArrayInGroup {

    static int[] reverseArrayInGroupInPlace(int[] arr,int k){
        int n = arr.length;
        if(n==1 || k==1){
            return arr;
        }
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] input3 = {1, 2, 3, 4, 5, 6};
        int[] input4 = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("K is: "+k);
        System.out.println("After Reversing array for given "+ k +" elements: "+Arrays.toString(reverseArrayInGroupInPlace(input1, k)));
        k=5;
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("K is: "+k);
        System.out.println("After Reversing array for given "+ k +" elements: "+Arrays.toString(reverseArrayInGroupInPlace(input2, k)));
        k=1;
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("K is: "+k);
        System.out.println("After Reversing array for given "+ k +" elements: "+Arrays.toString(reverseArrayInGroupInPlace(input3, k)));
        k = 10;
        System.out.println("\nInput array: "+ Arrays.toString(input4));
        System.out.println("K is: "+k);
        System.out.println("After Reversing array for given "+ k +" elements: "+Arrays.toString(reverseArrayInGroupInPlace(input4, k)));

    }
    //Code for ArrayList<Long> arr

}


/*Sample output:

Input array: [1, 2, 3, 4, 5, 6, 7, 8, 9]
K is: 3
After Reversing array for given 3 elements: [3, 2, 1, 6, 5, 4, 9, 8, 7]

Input array: [1, 2, 3, 4, 5, 6, 7, 8]
K is: 5
After Reversing array for given 5 elements: [5, 4, 3, 2, 1, 8, 7, 6]

Input array: [1, 2, 3, 4, 5, 6]
K is: 1
After Reversing array for given 1 elements: [1, 2, 3, 4, 5, 6]

Input array: [1, 2, 3, 4, 5, 6, 7, 8]
K is: 10
After Reversing array for given 10 elements: [8, 7, 6, 5, 4, 3, 2, 1]

 */