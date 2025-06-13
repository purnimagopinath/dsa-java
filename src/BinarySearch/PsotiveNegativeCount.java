//Easy
//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/submissions/1663003490/?envType=problem-list-v2&envId=binary-search
package BinarySearch;

import java.util.Arrays;

public class PsotiveNegativeCount {
    public static int maximumCount(int[] nums) {
        int pos=0, neg=0;
        for(int num:nums){
            if(num>0){
                pos++;
            }
            if(num<0){
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
    public static void main(String[] args) {
        int[] input1 = {-2, -1, -1, 1, 2, 3};

        System.out.println("\nInput array: "+ Arrays.toString(input1));
        System.out.println("Maximum Count for Either positive or negative is: "+maximumCount(input1));

        int[] input2={-3, -2, -1, 0, 0, 1, 2};
        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Maximum Count for Either positive or negative is: "+maximumCount(input2));

        int[] input3={5, 20, 66, 1314};
        System.out.println("\nInput array: "+ Arrays.toString(input3));
        System.out.println("Maximum Count for Either positive or negative is: "+maximumCount(input3));

    }

}

/*Sample Output:

Input array: [-2, -1, -1, 1, 2, 3]
Maximum Count for Either positive or negative is: 3

Input array: [-3, -2, -1, 0, 0, 1, 2]
Maximum Count for Either positive or negative is: 3

Input array: [5, 20, 66, 1314]
Maximum Count for Either positive or negative is: 4
 */
