package Revision_V2.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets-ii/
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void generateSubsets(int[] nums, int start, List<Integer> path, List<List<Integer>> ans){
        ans.add(new ArrayList<>(path));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            path.add(nums[i]);
            generateSubsets(nums, i+1, path, ans);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args){
        SubsetsII obj = new SubsetsII();
        int[] nums  = {1, 2, 2};
        System.out.println("Input is "+ Arrays.toString(nums));
        System.out.println("Output is "+(obj.subsetsWithDup(nums)));

        int[] nums1  = {0 };
        System.out.println("Input is "+Arrays.toString(nums1));
        System.out.println("Output is "+(obj.subsetsWithDup(nums1)));

    }
}


/*Sample Output:
Input is [1, 2, 2]
Output is [[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]
Input is [0]
Output is [[], [0]]
 */