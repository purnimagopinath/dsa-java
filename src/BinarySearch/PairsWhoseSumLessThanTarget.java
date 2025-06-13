//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/?envType=problem-list-v2&envId=binary-search
//Easy
package BinarySearch;

import java.util.Arrays;
import java.util.List;

public class PairsWhoseSumLessThanTarget {
    public static int countPairs(List<Integer> nums, int target) {
        int n= nums.size();
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((nums.get(i)+nums.get(j))<target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(-1, 1, 2, 3, 1);
        int target = 2;

        System.out.println("Input array: "+ input1);
        System.out.println("Target Element is: "+ target);
        System.out.println("Pairs with Sum Less than target is: "+countPairs(input1, target));

        List<Integer> input2 = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        target = -2;
        System.out.println("\nInput array: "+input2);
        System.out.println("Target Element is: "+ target);
        System.out.println("Pairs with Sum Less than target is:  "+countPairs(input2, target));
// We can probably sort and do left, right sum and check (r-l)

    }
}

/*Sample Output:
Input array: [-1, 1, 2, 3, 1]
Target Element is: 2
Pairs with Sum Less than target is: 3

Input array: [-6, 2, 5, -2, -7, -1, 3]
Target Element is: -2
Pairs with Sum Less than target is:  10
 */
