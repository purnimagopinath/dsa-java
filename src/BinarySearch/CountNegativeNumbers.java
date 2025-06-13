//Easy
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/?envType=problem-list-v2&envId=binary-search
package BinarySearch;

import java.util.Arrays;

public class CountNegativeNumbers {
    public static int countNegatives(int[][] grid) {
        int count=0;
        for(int[] arr: grid){
            for(int num:arr){
                if(num<0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] input1= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.out.println("\nInput array: "+ Arrays.deepToString(input1));
        System.out.println("Total negative numbers in array is: "+countNegatives(input1));

        int[][] input2={{3,2},{1,0}};
        System.out.println("\nInput array: "+Arrays.deepToString(input2));
        System.out.println("Total negative numbers in array is:  "+countNegatives(input2));

    }
    //Consider non-increasing order both row-wise and column-wise to get O(n+m) solution
}

/*Sample Output:

Input array: [[4, 3, 2, -1], [3, 2, 1, -1], [1, 1, -1, -2], [-1, -1, -2, -3]]
Total negative numbers in array is: 8

Input array: [[3, 2], [1, 0]]
Total negative numbers in array is:  0
 */
