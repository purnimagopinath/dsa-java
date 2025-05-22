//https://www.geeksforgeeks.org/maximum-consecutive-ones-or-zeros-in-a-binary-array/

// https://www.geeksforgeeks.org/problems/max-consecutive-one/1
package arrays;

import java.util.Arrays;

public class MaxConsecOnes {

    static int getMaxConsecOnesZeroes(int[] arr){
        int n = arr.length;
        int max_1 = 0; int max_0 = 0; int tracking_num;
        if (arr[0]==0){
            max_0 = 1;
            tracking_num = 0;
        }else{
            max_1 = 1;
            tracking_num = 1;
        }
        int current_count = 1;
        for(int i=1;i<n;i++){
            if (arr[i]!=tracking_num){
                current_count = 1;
                tracking_num = arr[i];
            }else{
                current_count++;
            }
            if (tracking_num==1){
                max_1 = Math.max(current_count, max_1);
            }else{
                max_0 = Math.max(current_count, max_0);
            }
        }

        return Math.max(max_1, max_0);
    }

    public static void main(String[] args) {
        int[] input1 = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int[] input2 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int[] input3 = {0,0,0,0};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Maximum Consecutive count is:"+getMaxConsecOnesZeroes(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Maximum Consecutive count is:"+getMaxConsecOnesZeroes(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Maximum Consecutive count is:"+getMaxConsecOnesZeroes(input3) );

    }

}

/* Output:
Input array: [1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1]
Maximum Consecutive count is:4

Input array: [0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1]
Maximum Consecutive count is:2

Input array: [0, 0, 0, 0]
Maximum Consecutive count is:4
 */