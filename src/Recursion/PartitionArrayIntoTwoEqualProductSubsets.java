//https://leetcode.com/problems/partition-array-into-two-equal-product-subsets/description/?envType=problem-list-v2&envId=recursion

//3566
//Medium

package Recursion;

import java.util.Arrays;

public class PartitionArrayIntoTwoEqualProductSubsets {
    public static boolean checkEqualPartitions(int[] nums, long target) {
        long total = 1;
        for(int num: nums){
            total*=num;
        }
        if((target*target) != total){
            return false;
        }
        Arrays.sort(nums);
        return isProdSubset(nums, nums.length, target);
    }

    public static boolean isProdSubset(int[] nums, int n, long target){
        if (target == 1)
            return true;
        if (n == 0)
            return false;

        if (nums[n-1]>target) {
            return isProdSubset(nums, n-1, target);
        }

        if(target%nums[n-1]==0 && isProdSubset(nums, n-1, target/nums[n-1])){
            return true;
        }
        return (isProdSubset(nums, n-1, target));
    }

    public static void main(String[] args){
        int[] nums = {3, 1, 6, 8, 4};
        int target = 24;
        System.out.println("\nGiven Array : "+ Arrays.toString(nums)+" And target : "+ target);
        System.out.println("Array can be partitioned to get target : "+checkEqualPartitions(nums, target));

        int[] nums1 = {2, 5, 3, 7};
        target = 15;
        System.out.println("\nGiven Array : "+ Arrays.toString(nums1)+" And target : "+ target);
        System.out.println("Array can be partitioned to get target : "+checkEqualPartitions(nums1, target));

        int[] nums2 = {12, 12, 4, 1};
        target = 24;
        System.out.println("\nGiven Array : "+ Arrays.toString(nums2)+" And target : "+ target);
        System.out.println("Array can be partitioned to get target : "+checkEqualPartitions(nums2, target));
    }
}


/*Sample Output:

Given Array : [3, 1, 6, 8, 4] And target : 24
Array can be partitioned to get target : true

Given Array : [2, 5, 3, 7] And target : 15
Array can be partitioned to get target : false

Given Array : [12, 12, 4, 1] And target : 24
Array can be partitioned to get target : false


 */