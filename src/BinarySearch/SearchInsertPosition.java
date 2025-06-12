//https://leetcode.com/problems/search-insert-position/description/


package BinarySearch;

import java.util.Arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low=0, high = (nums.length)-1;
        int mid;
        while(low < high) {

            mid = low + (high - low) / 2;
            if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return (nums[low] < target) ? low + 1 : low;

    }

    public static void main(String[] args) {
        int[] input1 = {1, 3, 5, 6};
        int target = 5;

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Target Element is: "+ target);
        System.out.println("Insert position is: "+searchInsert(input1, target));

        target = 2;
        System.out.println("\nInput array: "+ Arrays.toString(input1));
        System.out.println("Target Element is: "+ target);
        System.out.println("Insert position is: "+searchInsert(input1, target));

        target=7;
        System.out.println("\nInput array: "+ Arrays.toString(input1));
        System.out.println("Target Element is: "+ target);
        System.out.println("Insert position is: "+searchInsert(input1, target));

    }
}

/*Sample Output

Input array: [1, 3, 5, 6]
Target Element is: 5
Insert position is: 2

Input array: [1, 3, 5, 6]
Target Element is: 2
Insert position is: 1

Input array: [1, 3, 5, 6]
Target Element is: 7
Insert position is: 4
 */