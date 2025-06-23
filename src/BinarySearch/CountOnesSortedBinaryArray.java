//https://www.geeksforgeeks.org/dsa/count-1s-sorted-binary-array/
//
package BinarySearch;

import java.util.Arrays;

public class CountOnesSortedBinaryArray {
    static int countOnes(int[] arr) {
        // Your code goes here
        int n=arr.length;
        if(arr[n-1]==1){
            return n;
        }
        if(arr[0]==0){
            return 0;
        }
        int left=0, right=n-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == 0){
                right = mid-1;
            }else{
                if((mid==n-1) || (arr[mid+1]!=1)){
                    return (mid+1);
                }else{
                    left = mid+1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 1, 0, 0, 0, 0, 0};

        System.out.println("\nInput array: "+ Arrays.toString(input1));
        System.out.println("Number of One's present in the array: "+countOnes(input1));

        int[] input2 = {1, 1, 1, 1, 1, 1, 1};

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Number of One's present in the array: "+countOnes(input2));

        int[] input3 = {0, 0, 0, 0, 0, 0, 0};
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Number of One's present in the array: "+countOnes(input3));

    }
}
/*Sample Output:

Input array: [1, 1, 0, 0, 0, 0, 0]
Number of One's present in the array: 2

Input array: [1, 1, 1, 1, 1, 1, 1]
Number of One's present in the array: 7

Input array: [0, 0, 0, 0, 0, 0, 0]
Number of One's present in the array: 0
 */
