//https://www.geeksforgeeks.org/leaders-in-an-array/
//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

//Easy

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int[] arr) {
        // code here
        int n = arr.length ;
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = arr[n-1];
        leaders.add(max);
        for (int i = n-2 ; i>=0 ; i--) {
            if (arr[i] >= max) {
                max = arr[i] ;
                leaders.add(max) ;
            }
        }
        Collections.reverse(leaders) ;
        return leaders ;
    }

    public static void main(String[] args) {
        int[] input1 = {16, 17, 4, 3, 5, 2};
        int[] input2 = {10, 4, 2, 4, 1};
        int[] input3 = {5, 10, 20, 40};
        int[] input4 = {30, 10, 10, 5};
        int[] input5 = {1, 2, 3, 4, 5, 2};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Array Leaders are: "+leaders(input1));
        System.out.println("\nInput array: "+Arrays.toString(input2)) ;
        System.out.println("Array Leaders are: "+leaders(input2));
        System.out.println("\nInput array: "+Arrays.toString(input3)) ;
        System.out.println("Array Leaders are: "+leaders(input3));
        System.out.println("\nInput array: "+Arrays.toString(input4)) ;
        System.out.println("Array Leaders are: "+leaders(input4));
        System.out.println("\nInput array: "+Arrays.toString(input5)) ;
        System.out.println("Array Leaders are: "+leaders(input5));

    }


}
/*Sample Output:

Input array: [16, 17, 4, 3, 5, 2]
Array Leaders are: [17, 5, 2]

Input array: [10, 4, 2, 4, 1]
Array Leaders are: [10, 4, 4, 1]

Input array: [5, 10, 20, 40]
Array Leaders are: [40]

Input array: [30, 10, 10, 5]
Array Leaders are: [30, 10, 10, 5]

Input array: [1, 2, 3, 4, 5, 2]
Array Leaders are: [5, 2]

 */
