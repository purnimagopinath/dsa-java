package Mock;
/*Problem Statement:
You are given an integer array arr (possibly containing duplicates). Partition it into the maximum number of chunks such that sorting each chunk individually and concatenating them results in the entire array being sorted.

Return the maximum number of chunks.

Input: [5,4,3,2,1]
Output: 1

Input: [2,1,3,4,4]
Output: 4
 */


/*My Thought Process:

Problem Understanding:
Let me clarify the problem.
We have to divide the given array into chunks and sort those chunks to form a sorted array.
While at it, we must ensure that we are dividing the array into maximum possible subchunks.
Ex: [0,1,2,3,4] would be 5 chunks

Approaches:
Since the array size and values arent specified,
let me assume that it is an integer array and can be of any length.

1. The brute force solution would be to use nested loops to try and divide the array into different partitions at each index.
It would take exponential time and might not be a good idea since we wouldnt want to encounter TLE.

Another approach i can think of is to use recursion.
2. At each index, our choice will be either to partition it there or to not partition it there.
So recursion makes sense here. But it would take up 2^n time and also we might be repeating few calls which will eat up our space and time.
3. To optimize it, we can use memoization to keep track of the result of partitions where the array turns out to be sorted.

Implementation Details:
Let me think it through
At any particular index, I would like to keep track of two things.
1. Whether I would be able to get a sorted array from here and
2. How many max partitions are possible from here.

Further Optimization:
Pruning:
arr[i]<arr[i+1] then only I will partition it at that index,
otherwise I can move ahead since we will have to sort the array if arr[i]>arr[i+1] and partitioning at i will not result in a sorted array.

Post pruning, we wont have much use for revisited nodes, since we are always moving forward, we can use one array to track maxcounts

To keep track of maximum element till idx, we are using a maxArray

We can avoid this space utilization if we use a while loop instead of recursive call


 */

import java.util.Arrays;

public class MaxPartitions {

    public int maxPartitionCount(int[] nums){
        int n = nums.length;
        if(n<=1) return n;
        int[] maxInteger = new int[n];
        maxInteger[0] = nums[0];
        int[] maxCount = new int[n];
        return checkPartitions(nums, n, 0, maxCount, maxInteger);
    }

    public int checkPartitions(int[] nums, int n , int idx, int[] maxCount, int[] maxInteger){
        if(idx==n) return 0;

        int count = 0;
        //partition check
        if(idx+1<n && maxInteger[idx]<=nums[idx+1]){
            maxInteger[idx+1] = nums[idx+1];
            count = 1+checkPartitions(nums, n, idx+1, maxCount, maxInteger);

        }else if(idx+1==n){
            count = 1;
        }else{
            maxInteger[idx+1] = nums[idx];
            count = checkPartitions(nums, n, idx+1, maxCount, maxInteger);
        }

        maxCount[idx] = Math.max(maxCount[idx], count);

        return maxCount[idx];



        //no partition
    }

    public static void main(String[] args){
        MaxPartitions obj = new MaxPartitions();
        int[][] input = {{5, 4, 3, 2, 1}, {2, 1, 3, 4, 4}, {-1, 0, 1, 2, 3}, {2, 1, 1, 3, 4}};

        for(int[] inp:input){
            System.out.println("Given Input is : "+Arrays.toString(inp));
            System.out.println("Maximum Partitions that can be done to sort the array is : "+obj.maxPartitionCount(inp));
        }


    }


    /*Sample Output:


Given Input is : [5, 4, 3, 2, 1]
Maximum Partitions that can be done to sort the array is : 1

Given Input is : [2, 1, 3, 4, 4]
Maximum Partitions that can be done to sort the array is : 4

Given Input is : [-1, 0, 1, 2, 3]
Maximum Partitions that can be done to sort the array is : 5

Given Input is : [2, 1, 1, 3, 4]
Maximum Partitions that can be done to sort the array is : 3


     */
}
