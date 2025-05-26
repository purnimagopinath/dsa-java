/*Given an array of integers A, find and return the product array of the same size where the
ith element of the product array will be equal to the product of all the elements divided by the
 ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values.
Solve it without using the division operator.

Return the product array.

2 <= length of the array <= 1000
1 <= A[i] <= 10
 */
package arrays;

import java.util.Arrays;

public class ProductArray {
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] prodArray = new int[n];
        prodArray[0] = A[0];
        for(int i=1;i<n;i++){
            prodArray[i] = prodArray[i-1]*A[i];
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=prodArray[n-1]/A[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {5, 1, 10, 1};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Product Array is: "+Arrays.toString(solve(input1)) );

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Product Array is: "+Arrays.toString(solve(input2)) );

    }
}

/*Sample Output:

Input array: [1, 2, 3, 4, 5]
Product Array is: [120, 60, 40, 30, 24]

Input array: [5, 1, 10, 1]
Product Array is: [10, 50, 5, 50]

 */
