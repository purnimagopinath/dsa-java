//https://www.geeksforgeeks.org/remove-element/
//Easy

package arrays;

import java.util.Arrays;

public class RemoveAllOccurencesOfElement {
    static int solve(int[] arr, int k) {
        int ind = 0 ;
        int n = arr.length ;
        for (int i=0; i<n; i++) {
            if(arr[i]!=k){
                arr[ind] = arr[i] ;
                ind++;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int[] input1 = {3, 2, 2, 3};
        int b=3;
        int[] input2 = {0, 1, 3, 0, 2, 2, 4, 2};

        System.out.println("\nInput array: "+ Arrays.toString(input1));
        System.out.println("Element to consider: "+b);
        System.out.println("No. of elements after removing given element is: "+solve(input1, b));

        b = 2;
        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Element to consider: "+b);
        System.out.println("No. of elements after removing given element is: "+solve(input2, b));


    }
}

/*Sample Output:

Input array: [3, 2, 2, 3]
Element to consider: 3
No. of elements after removing given element is: 2

Input array: [0, 1, 3, 0, 2, 2, 4, 2]
Element to consider: 2
No. of elements after removing given element is: 5
 */