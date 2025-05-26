/*
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index
 */
package arrays;

import java.util.Arrays;

public class EquilibriumIndex {
    public static int solve(int[] A) {
        long sum1 = 0;
        for (int j : A) {
            sum1 += j;
        }
        long sum2 = 0;  // sum of elements at lower indexes
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < A.length ; i++){
            sum1 -= A[i];   // sum of elements at higher indexes
            if(sum1 == sum2){
                ans = i;
                break;
            }
            sum2 += A[i];
        }
        if(ans == Integer.MAX_VALUE)
            ans =- 1;   // If no equilibrium index found, then return -1
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = {-7, 1, 5, 2, -4, 3, 0};
        int[] input2 = {1, 2, 3};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Equilibrium Index is: "+solve(input1));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Equilibrium Index is : "+solve(input2));

    }

}

/*Sample Output:

Input array: [-7, 1, 5, 2, -4, 3, 0]
Equilibrium Index is: 3

Input array: [1, 2, 3]
Equilibrium Index is : -1
 */
