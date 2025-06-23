//https://www.geeksforgeeks.org/dsa/find-minimum-element-in-a-sorted-and-rotated-array/

//https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1


package BinarySearch;

import java.util.Arrays;

public class MinimumInSortedRotatedArray {
    public static int findMin(int[] arr) {
        // complete the function here
        int n=arr.length;
        int left=0, right=n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<arr[mid-1]){
                return arr[mid];
            }else{
                left=mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input1 = {5, 6, 1, 2, 3, 4};

        System.out.println("\nInput array: "+ Arrays.toString(input1));
        System.out.println("Minimum number present in the array: "+findMin(input1));

        int[] input2 = {3, 1, 2};

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Minimum number present in the array: "+findMin(input2));

        int[] input3 = {4, 2, 3};
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Minimum number present in the array: "+findMin(input3));

    }
    //Code failed for the input :  84 3 20 54 56 58 66 73 75
    // But this is unsorted array
}

/*Sample Output:

Input array: [5, 6, 1, 2, 3, 4]
Minimum number present in the array: 1

Input array: [3, 1, 2]
Minimum number present in the array: 1

Input array: [4, 2, 3]
Minimum number present in the array: 2
 */