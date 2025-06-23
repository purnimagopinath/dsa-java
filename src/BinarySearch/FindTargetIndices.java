//Easy
//https://leetcode.com/problems/find-target-indices-after-sorting-array/?envType=problem-list-v2&envId=binary-search


package BinarySearch;
import java.sql.Array;
import java.util.*;

public class FindTargetIndices {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> targetArr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                targetArr.add(i);
            }
        }
        return targetArr;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 5, 2, 3};
        int target = 2;

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Target Element is: "+ target);
        System.out.println("TAfter Sorting the indices where target is present: "+targetIndices(input1, target));

        int[] input2 = {1, 2, 5, 2, 3};
        target = 3;
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Target Element is: "+ target);
        System.out.println("After Sorting the indices where target is present:  "+targetIndices(input2, target));

        int[] input3 = {1, 2, 5, 2, 3};
        target = 5;
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Target Element is: "+ target);
        System.out.println("After Sorting the indices where target is present:  "+targetIndices(input2, target));

        //Can do without sorting by using left right pointers. check again
    }
}
/*Sample Output:
Input array: [1, 2, 5, 2, 3]
Target Element is: 2
TAfter Sorting the indices where target is present: [1, 2]

Input array: [1, 2, 5, 2, 3]
Target Element is: 3
After Sorting the indices where target is present:  [3]

Input array: [1, 2, 5, 2, 3]
Target Element is: 5
After Sorting the indices where target is present:  [4]

 */
