//Medium

//https://www.geeksforgeeks.org/majority-element/

//https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
package arrays;

import java.util.Arrays;

public class MajorityElement {

    public static int getMajorityElement(int[] arr){
        int candidate = -1, count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

         count = 0;
         for (int num : arr) {
             if (num == candidate) {
                 count++;
             }
         }
         if (count > arr.length / 2) {
             return candidate;
         } else {
             return -1;
        }
    }


    public static void main(String[] args) {
        int[] input1 = {1, 1, 2, 1, 3, 5, 1};
        int[] input2 = {7};
        int[] input3 = {2, 13};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Majority Element is: "+getMajorityElement(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Majority Element  is: "+getMajorityElement(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Majority Element  is: "+getMajorityElement(input3) );

    }
    //Boyer–Moore Majority Vote Algorithm.
}

/*Output:

Input array: [1, 1, 2, 1, 3, 5, 1]
Majority Element is: 1

Input array: [7]
Majority Element  is: 7

Input array: [2, 13]
Majority Element  is: -1
 */
