//Easy
//https://leetcode.com/problems/intersection-of-two-arrays/?envType=problem-list-v2&envId=binary-search
package BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        int p1 = 0;
        int p2 = 0;
        Set<Integer> intersection = new HashSet<>();
        while (p1 < n && p2 < m) {
            if (nums1[p1] == nums2[p2]) {
                intersection.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if (nums1[p1] < nums2[p2]) {
                p1++;
            }
            else {
                p2++;
            }
        }
        int i = intersection.size();
        int[] result = new int[i];
        int curr = 0;
        for (int x: intersection) {
            result[curr++] = x;
        }
        return result;

    }
    public static void main(String[] args) {
        int[] input1= {1, 2, 2, 1};
        int[] input2={2, 2};
        System.out.println("\nInput arrays: "+ Arrays.toString(input1)+"   "+Arrays.toString(input2));
        System.out.println("Intersection in array is: "+Arrays.toString(intersection(input1, input2)));

        int[] input3= {4,9,5};
        int[] input4={9,4,9,8,4};
        System.out.println("\nInput array: "+Arrays.toString(input3)+"   "+Arrays.toString(input4));
        System.out.println("Intersection in array is:  "+Arrays.toString(intersection(input3, input4)));

    }
    //Since array size doesnt exceed 1000, we can probably solve this using the same strategy as string count
}

/*Sample Output:
Input arrays: [1, 2, 2, 1]   [2, 2]
Intersection in array is: [2]

Input array: [4, 9, 5]   [9, 4, 9, 8, 4]
Intersection in array is:  [4, 9]

 */