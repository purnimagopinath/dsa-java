//https://www.geeksforgeeks.org/maximum-product-subarray/

//https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1

package arrays;

import java.util.Arrays;

public class MaximumProductSubarray {
    static int maxProduct(int[] arr) {
        // code here
        int n= arr.length;
        int max=arr[0], min=arr[0];
        int maxP=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(max*arr[i], arr[i]);
            min = Math.min(min*arr[i], arr[i]);
            maxP = Math.max(max, maxP);
        }
        return maxP;
    }
    public static void main(String[] args) {
        int[] input1 = {-2, 6, -3, -10, 0, 2};
        int[] input2 = {-1, -3, -10, 0, 6};
        int[] input3 = {2, 3, 4};
        int[] input4 = {-2, 0, -1};
        //{-8, 10, -9, 6, 6}


        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Maximum Product is: "+maxProduct(input1) );

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Maximum Product is: "+maxProduct(input2));

        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Maximum Product is: "+maxProduct(input3));

        System.out.println("\nInput array: "+Arrays.toString(input4));
        System.out.println("Maximum Product is: "+maxProduct(input4));

    }
}
/*Sample Output:

Input array: [-2, 6, -3, -10, 0, 2]
Maximum Product is: 180

Input array: [-1, -3, -10, 0, 6]
Maximum Product is: 30

Input array: [2, 3, 4]
Maximum Product is: 24

Input array: [-2, 0, -1]
Maximum Product is: 0
 */