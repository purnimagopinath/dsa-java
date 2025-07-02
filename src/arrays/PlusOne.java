//https://www.geeksforgeeks.org/adding-one-to-number-represented-as-array-of-digits/

//https://www.geeksforgeeks.org/problems/adding-one2529/1

//Easy

package arrays;

import java.util.Arrays;

public class PlusOne {
    static int addOne(int[] arr) {
        // code here
        int sum = 1 ;
        int n = arr.length ;

        for (int i = 0; i < n ; i++) {
            sum += (int) (arr[i] * Math.pow(10, n-1-i));
        }

        return sum ;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 4};
        int[] input2 = {9, 9, 9};
        int[] input3 = {5, 6, 7, 8};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Sum of represented digits plus one is: "+addOne(input1));
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Sum of represented digits plus one is: "+addOne(input2));
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Sum of represented digits plus one is: "+addOne(input3));


    }

    //GFG expected vector representation of sum

}


/*Sample Output:

Input array: [1, 2, 4]
Sum of represented digits plus one is: 125

Input array: [9, 9, 9]
Sum of represented digits plus one is: 1000

Input array: [5, 6, 7, 8]
Sum of represented digits plus one is: 5679

 */