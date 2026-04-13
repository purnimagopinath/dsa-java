package Revision_V2.Medium;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

//https://leetcode.com/problems/fruit-into-baskets/description/
public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int total = 0;
        int left=0, right = 0;
        Map<Integer, Integer> types = new HashMap<>();

        while(right<n){
            types.put(fruits[right], types.getOrDefault(fruits[right], 0)+1);
            while(types.size()>2){
                types.put(fruits[left], types.getOrDefault(fruits[left],0)-1);
                if(types.get(fruits[left])<=0) types.remove(fruits[left]);
                left++;
            }
            total = Math.max(total, right-left+1);
            right++;
        }

        return total;
    }

    public static void main(String[] args){
        FruitIntoBaskets obj = new FruitIntoBaskets();
        int[] nums  = {1, 2, 1};
        System.out.println("\nInput is "+ Arrays.toString(nums));
        System.out.println("Output is "+(obj.totalFruit(nums)));

        int[] nums1  = {0, 1, 2, 2};
        System.out.println("\nInput is "+Arrays.toString(nums1));
        System.out.println("Output is "+(obj.totalFruit(nums1)));

        int[] nums2  = {1, 2, 3, 2, 2};
        System.out.println("\nInput is "+Arrays.toString(nums2));
        System.out.println("Output is "+(obj.totalFruit(nums2)));
    }
}


/*Sample Output

Input is [1, 2, 1]
Output is 3

Input is [0, 1, 2, 2]
Output is 3

Input is [1, 2, 3, 2, 2]
Output is 4


 */