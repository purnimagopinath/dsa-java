//https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
//https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

//Easy
package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeatingNumber {
    static ArrayList<Integer> findTwoElement(int[] arr) {
        // code here
        int n = arr.length ;
        int[] visArray = new int[n] ;
        for (int num : arr) {
            visArray[num-1]++;
        }
        int missing = -1;
        int repeating = -1;
        for (int i =0 ; i<n ; i++) {
            if (visArray[i]==0) {
                missing = i+1 ;
            }
            if (visArray[i]==2) {
                repeating = i+1 ;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {2, 2};
        int[] input2 = {1, 3, 3};
        int[] input3 = {4, 3, 6, 2, 1, 1};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Repeating and missing elements are: "+findTwoElement(input1));
        System.out.println("\nInput array: "+Arrays.toString(input2)) ;
        System.out.println("Repeating and missing elements are: "+findTwoElement(input2));
        System.out.println("\nInput array: "+Arrays.toString(input3)) ;
        System.out.println("Repeating and missing elements are: "+findTwoElement(input3));

    }
}

/*Sample Output:

Input array: [2, 2]
Repeating and missing elements are: [2, 1]

Input array: [1, 3, 3]
Repeating and missing elements are: [3, 2]

Input array: [4, 3, 6, 2, 1, 1]
Repeating and missing elements are: [1, 5]


 */