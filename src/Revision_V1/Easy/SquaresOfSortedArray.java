package Revision_V1.Easy;
//Arrays
import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class SquaresOfSortedArray {

    public int[] squares(int[] nums){
        int n = nums.length;
        int left = 0;
        int right=n-1;
        int idx = n - 1;

        int[] res = new int[n];

        while(left<=right){
            int l = nums[left]*nums[left];
            int r = nums[right]*nums[right];
            if(l > r){
                res[idx] = l;
                left++;
            }else{
                res[idx] = r;
                right--;
            }
            idx--;

        }

        return res;
    }

    public static void main(String[] args){
        int[][] inputs = {{-4, -1, 0, 3, 10},
                {-7, -3, 2, 3, 11}};
        SquaresOfSortedArray obj = new SquaresOfSortedArray();
        for(int[] input:inputs){
            System.out.println("\nInput is: "+Arrays.toString(input));
            System.out.println("Output is: "+Arrays.toString(obj.squares(input)));
        }
    }
}


/*Expected Output:
Input is: [-4, -1, 0, 3, 10]
Output is: [0, 1, 9, 16, 100]

Input is: [-7, -3, 2, 3, 11]
Output is: [4, 9, 9, 49, 121]


 */
