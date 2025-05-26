/*
Given an array A of N integers.
Count the number of elements that have at least 1 elements greater than itself.

 */
package arrays;

import java.util.Arrays;

public class CountOfElementsAtleastOneGreaterThanItself {
    static int getCountofElements(int[] arr){
        int n = arr.length;
        //finding greatest element
        int max_element = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max_element){
                max_element = arr[i];
            }
        }
        int count=0;
        for (int j : arr) {
            if (j != max_element) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] input1 = {3,1,2};
        int[] input2 = {5,5,3};
        int[] input3 = {10, 10, 10};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Number of elements that have at least 1 elements greater than itself are: "+getCountofElements(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Number of elements that have at least 1 elements greater than itself are: "+getCountofElements(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Number of elements that have at least 1 elements greater than itself are: "+getCountofElements(input3) );

    }
    //while getting ma element, can count occurence of it and subtract from it to get count too. Reduced one loop.
}
/* Sample Output
Input array: [3, 1, 2]
Number of elements that have at least 1 elements greater than itself are: 2

Input array: [5, 5, 3]
Number of elements that have at least 1 elements greater than itself are: 1

Input array: [10, 10, 10]
Number of elements that have at least 1 elements greater than itself are: 0

 */