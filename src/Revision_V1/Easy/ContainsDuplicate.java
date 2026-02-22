package Revision_V1.Easy;
//Arrays

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

    public static void main(String[] args){
        ContainsDuplicate obj = new ContainsDuplicate();
        int[][] inputs = {{1,2,3,1},  {1, 2, 3, 4}, {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}};

        for(int[] input:inputs){
            System.out.println("\nInput is: "+Arrays.toString(input));
            System.out.println("Output is: "+obj.hasDuplicates(input));
        }
    }

    public boolean hasDuplicates(int[] nums){
        int n = nums.length;
        if(n<=1) return false;

        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            if(set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}


/*Sample Output:
Input is: [1, 2, 3, 1]
Output is: true

Input is: [1, 2, 3, 4]
Output is: false

Input is: [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output is: true
 */
