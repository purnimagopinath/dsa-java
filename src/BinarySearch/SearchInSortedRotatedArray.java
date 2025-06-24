//https://www.geeksforgeeks.org/dsa/search-an-element-in-a-sorted-and-pivoted-array/
//https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
//Medium


package BinarySearch;

import java.util.Arrays;

public class SearchInSortedRotatedArray {
    static int search(int[] arr, int key) {
        // Complete this function
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(arr[l]<arr[mid]) {
                //left sorted
                if ((key > arr[mid]) || key < arr[l]) {
                    //left sorted
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }else{
                if((key<arr[mid])||(key>arr[r])){
                    //right sorted
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input1 = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 3;

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Target Element is: "+ target);
        System.out.println("Element is in: "+search(input1, target));

        int[] input2 = {3, 5, 1, 2};
        target = 6;
        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Target Element is: "+ target);
        System.out.println("Element is in: "+search(input2, target));

        int[] input3 = {33, 42,72, 99};
        target=42;
        System.out.println("\nInput array: "+ Arrays.toString(input3));
        System.out.println("Target Element is: "+ target);
        System.out.println("Element is in: "+search(input3, target));

    }

//Doesnt work for {2, 3, 4, 5, 1} key=1 Expecting 4 ; Gives -1
}
/*Sample Output:

Input array: [5, 6, 7, 8, 9, 10, 1, 2, 3]
Target Element is: 3
Element is in: 8

Input array: [3, 5, 1, 2]
Target Element is: 6
Element is in: -1

Input array: [33, 42, 72, 99]
Target Element is: 42
Element is in: 1
 */