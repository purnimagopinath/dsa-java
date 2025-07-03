//https://www.geeksforgeeks.org/insert-an-adjacent-k-in-place-for-every-occurrence-of-it-in-the-array-keeping-the-size-of-the-array-intact/
//Easy

package arrays;

import java.util.Arrays;

public class InsertDuplicatesForElement {
    static int[] insertDuplicates(int[] arr, int d) {
        // add your code here
        int n = arr.length;
        if (n <= 1 ){
            return arr;
        }
        int carry = Integer.MAX_VALUE ;
        int i = 0 ;
        while ((i<n) && (carry==Integer.MAX_VALUE)) {
            if ((arr[i]==d) && (i+1<n)) {
                carry = arr[i+1] ;
                arr[i+1] = 0 ;
                i++;
            }
            i++;
        }
        if (i>=n) {
            return arr ;
        }
        for (; i<n ; i++) {
            if (carry == 0) {
                carry = arr[i];
                arr[i] = 0 ;
                arr[i+1] = 0 ;
                i++ ;
            }else{
                int temp = carry ;
                carry = arr[i] ;
                arr[i] = temp ;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] input1 = {1, 0, 2, 3, 0, 4, 5, 0};
        int d = 0;
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("After Insert an adjacent duplicate for all occurrences of a given element: " +d +" : "+Arrays.toString(insertDuplicates(input1, d)));
        int[] input2 = {7, 5, 8};
        d = 8;
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("After Insert an adjacent duplicate for all occurrences of a given element: " +d +" : "+Arrays.toString(insertDuplicates(input2, d)));


    }
}
/*Sample Output:

Input array: [1, 0, 2, 3, 0, 4, 5, 0]
After Insert an adjacent duplicate for all occurrences of a given element: 0 : [1, 0, 0, 2, 3, 0, 0, 4]

Input array: [7, 5, 8]
After Insert an adjacent duplicate for all occurrences of a given element: 8 : [7, 5, 8]
 */