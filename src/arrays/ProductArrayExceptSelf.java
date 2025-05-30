//https://www.geeksforgeeks.org/a-product-array-puzzle/
//https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1

package arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] arr) {
        // code here
        int n = arr.length;
        int zeroCount = 0;
        int totalProduct=1;
        for (int j : arr) {
            if (j == 0) {
                zeroCount++;
            } else {
                totalProduct = totalProduct * j;
            }
        }
        if(zeroCount>1){
            return new int[n];
        }
        int[] prodArray = new int[n];
        for(int i=0;i<n;i++){
            if(zeroCount==1){
                prodArray[i] = ((arr[i]==0)? totalProduct : 0);
            }else{
                prodArray[i] = totalProduct/arr[i];
            }
        }
        return prodArray;
    }
    public static void main(String[] args) {
        int[] input1 = {10, 3, 5, 6, 2};
        int[] input2 = {12, 0};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Product Array Except Self is: "+Arrays.toString(productExceptSelf(input1)));
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Product Array Except Self is: "+Arrays.toString(productExceptSelf(input2)));

    }
}
/*Sample output:

Input array: [10, 3, 5, 6, 2]
Product Array Except Self is: [180, 600, 360, 300, 900]

Input array: [12, 0]
Product Array Except Self is: [0, 12]
 */