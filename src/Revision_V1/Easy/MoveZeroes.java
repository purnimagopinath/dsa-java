package Revision_V1.Easy;
//https://leetcode.com/problems/move-zeroes/description/
//Arrays

import java.util.Arrays;
public class MoveZeroes {

    public static void main(String[] args){
        MoveZeroes obj = new MoveZeroes();
        int[][] inputs = {{0,1,0,3,12}, {0}};

        for(int[] input:inputs){
            System.out.println("\nInput is "+Arrays.toString(input));
            System.out.println("Output is: "+Arrays.toString(obj.moveZeroes(input)));
        }
    }

    public int[] moveZeroes(int[] nums){
        int n = nums.length;

        if(n<=1) return nums;

        int left = -1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(left==-1) left = i;
            }else{
                if(left!=-1){
                    nums[left] = nums[i];
                    nums[i] = 0;
                    i = left;
                    left = -1;
                }
            }
        }

        return nums;
    }
}


/*Sample Output:

Input is [0, 1, 0, 3, 12]
Output is: [1, 3, 12, 0, 0]

Input is [0]
Output is: [0]
 */