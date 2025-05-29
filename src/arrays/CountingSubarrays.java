/*Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.

1 <= N <= 5 x 103

1 <= A[i] <= 1000

1 <= B <= 107

Return an integer denoting the number of subarrays in A having sum less than B.
 */
package arrays;

import java.util.Arrays;

public class CountingSubarrays {
    public static int solve(int[] A, int B) {
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            if(A[i]<B){
                count++;
            }
            sum+=A[i];
            for(int j=i+1;j<n;j++){
                sum+=A[j];
                if(sum<B){
                    count++;
                }else{
                    j=n;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input1 = {2, 5, 6};
        int b=10;
        int[] input2 = {1, 11, 2, 3, 15};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Sum to consider: "+b);
        System.out.println("No. of Subarrays is: "+solve(input1, b));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Sum to consider: "+b);
        System.out.println("No. of Subarrays is: "+solve(input2, b));


    }
}
/*Sample Output:

Input array: [2, 5, 6]
Sum to consider: 10
No. of Subarrays is: 4

Input array: [1, 11, 2, 3, 15]
Sum to consider: 10
No. of Subarrays is: 4
 */