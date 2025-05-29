/*

Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.

1 <= len(A) <= 5 x 10^3
1 <= A[i] <= 10^3
1 <= B <= 10^7

Return the count of good subarrays in A.
 */

package arrays;

import java.util.Arrays;

public class GoodSubarrays {
    public static int solve(int[] A, int B) {
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=A[j];
                int length = j - i + 1;
                if((length%2==0 &&sum<B)||(length%2!=0&&sum>B)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int b=4;
        int[] input2 = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Sum to consider: "+b);
        System.out.println("No. of Good Subarrays is: "+solve(input1, b));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        b = 65;
        System.out.println("Sum to consider: "+b);
        System.out.println("No. of Good Subarrays is: "+solve(input2, b));


    }

}

/*Sample Output:

Input array: [1, 2, 3, 4, 5]
Sum to consider: 4
No. of Good Subarrays is: 6

Input array: [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
Sum to consider: 65
No. of Good Subarrays is: 36

 */