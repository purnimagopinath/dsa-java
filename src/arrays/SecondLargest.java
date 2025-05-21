// https://www.geeksforgeeks.org/problems/second-largest3735/1

package arrays;

import java.util.Arrays;

public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // return -1 if array doesnt have atleast two elements
        if(arr.length<2){
            return -1;
        }

        int largest = arr[0];
        int sec_largest = -1;
        int i = 1;

        while(i<arr.length){
            if(arr[i]>largest){
                sec_largest = largest;
                largest = arr[i];
            }else{
                if(arr[i]>sec_largest && arr[i]!=largest){
                    sec_largest = arr[i];
                }
            }
            i = i+1;
        }
        return sec_largest;
    }

    public static void main(String[] args) {
        int[] input1 = {12, 35, 1, 10, 34, 1};
        int[] input2 = {10,5,10};
        int[] input3 = {10, 10, 10};
        System.out.println("Input array: "+Arrays.toString(input1));
        System.out.println("Second Largest number is: "+getSecondLargest(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Second Largest number is: "+getSecondLargest(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Second Largest number is: "+getSecondLargest(input3) );

    }

    /* Input array: [12, 35, 1, 10, 34, 1]
    Second Largest number is: 34

    Input array: [10, 5, 10]
    Second Largest number is: 5

    Input array: [10, 10, 10]
    Second Largest number is: -1
    */
}
