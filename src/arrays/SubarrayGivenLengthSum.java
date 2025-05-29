/*Given an array A of length N. Also given are integers B and C.

Return 1 if there exists a subarray with length B having sum C and 0 otherwise

1 <= N <= 105

1 <= A[i] <= 104

1 <= B <= N

1 <= C <= 109
Return 1 if such a subarray exist and 0 otherwise

 */
package arrays;

import java.util.Arrays;

public class SubarrayGivenLengthSum {
    public static int solve(int[] A, int B, int C) {
        int n=A.length;
        if(n<B){
            return 0;
        }
        int sum=0;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        if(C==sum){
            return 1;
        }

        for(int i=B;i<n;i++){
            sum=sum+A[i]-A[i-B];
            if(C==sum){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input1 = {4, 3, 2, 6, 1};
        int[] input2 = {4, 2, 2, 5,1};

        int b=3;
        int c=11;
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Given length and sum: "+b+" "+c);
        System.out.println("Subarray Present or not: "+solve(input1, b, c) );
        b=4;c=6;
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Given length and sum: "+b+" "+c);
        System.out.println("Subarray Present or not: "+solve(input2, b, c) );

    }}

/*Sample Output:

Input array: [4, 3, 2, 6, 1]
Given length and sum: 3 11
Subarray Present or not: 1

Input array: [4, 2, 2, 5, 1]
Given length and sum: 4 6
Subarray Present or not: 0
 */