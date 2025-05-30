//https://www.geeksforgeeks.org/number-subarrays-product-less-k/
//https://www.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1

package arrays;

import java.util.Arrays;

public class SubarrayProductLessThanK {
    public static long countSubArrayProductLessThanK(long[] arr, int n, long k) {
        long count = 0;
        long prod = 1;
        int left = 0;

        for (int right = 0; right < n; right++) {
            prod = prod*arr[right];

            while (prod >= k && left <= right) {
                prod = prod/arr[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;

    }

    public static void main(String[] args) {
        long[] input1 = {1, 2, 3, 4};
        long[] input2 = {1, 9, 2, 8, 6, 4, 3};
        long k = 10;
        int n=4;
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Subarrays with product less than : "+k+" is: "+countSubArrayProductLessThanK(input1, n, k));
        System.out.println("\nInput array: "+Arrays.toString(input2));
        n=7; k=100;
        System.out.println("Subarrays with product less than : "+k+" is: "+countSubArrayProductLessThanK(input2, n, k));

    }

}

/*Sample output:

Input array: [1, 2, 3, 4]
Subarrays with product less than : 10 is: 7

Input array: [1, 9, 2, 8, 6, 4, 3]
Subarrays with product less than : 100 is: 16
 */