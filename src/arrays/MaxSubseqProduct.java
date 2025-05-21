//https://www.geeksforgeeks.org/problems/three-great-candidates0515/1

package arrays;

import java.util.Arrays;

public class MaxSubseqProduct {
    static int maxProduct(int[] arr){
        // code here
        int i=0;
        int n = arr.length;
        int max_product = arr[0]*arr[1]*arr[2];
        while(i<n-2){
            int j=i+1;
            while(j<n-1){
                int k = j+1;
                while(k<n){
                    if (max_product<(arr[i]*arr[j]*arr[k])){
                        max_product = (arr[i]*arr[j]*arr[k]);
                    }
                    k=k+1;
                }
                j=j+1;
            }
            i=i+1;
        }
        return max_product;
    }

    public static void main(String[] args) {
        int[] input1 = {10, 3, 5, 6, 20};
        int[] input2 = {-10, -3, -5, -6, -20};
        int[] input3 = {1, -4, 3, -6, 7, 0};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Three Great Candidates are: "+maxProduct(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Three Great Candidates are: "+maxProduct(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Three Great Candidates are: "+maxProduct(input3) );

    }

    //Times out as there are three loops.
    // complexity O(n^3)
}

/* Output:
Input array: [10, 3, 5, 6, 20]
Three Great Candidates are: 1200

Input array: [-10, -3, -5, -6, -20]
Three Great Candidates are: -90

Input array: [1, -4, 3, -6, 7, 0]
Three Great Candidates are: 168

 */