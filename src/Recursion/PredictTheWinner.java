//https://leetcode.com/problems/predict-the-winner/description/?envType=problem-list-v2&envId=recursion

//486

//Medium

package Recursion;

import java.util.Arrays;

public class PredictTheWinner {
    public static boolean predictTheWinner(int[] nums) {
        int n = nums.length;


        int total=0;
        for(int num: nums){
            total+=num;
        }

        int player1 = solve(nums, 0, n-1);
        int player2 = total - player1;

        return player1 >= player2;

    }

    static int solve(int[] nums, int l, int r) {

        if(l > r)
            return 0;

        if(l == r)
            return nums[l];

        int take_left  = nums[l] + Math.min(solve(nums, l+2, r), solve(nums, l+1,r-1));

        int take_right = nums[r] + Math.min(solve(nums, l, r-2), solve(nums, l+1,r-1));


        return Math.max(take_left, take_right);

    }

    public static void main(String[] args){
        int[] nums = {1,5,2};
        System.out.println("\nGiven Array : "+ Arrays.toString(nums));
        System.out.println("Player 1 can win the game : "+predictTheWinner(nums));

        int[] nums1 = {1,5,233, 7};
        System.out.println("\nGiven Array : "+ Arrays.toString(nums1));
        System.out.println("Player 1 can win the game : "+predictTheWinner(nums1));
    }


}

/*Sample Output:

Given Array : [1, 5, 2]
Player 1 can win the game : false

Given Array : [1, 5, 233, 7]
Player 1 can win the game : true


 */