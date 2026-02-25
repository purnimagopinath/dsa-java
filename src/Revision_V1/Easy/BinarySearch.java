package Revision_V1.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/binary-search/description/
public class BinarySearch {

    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(target==nums[mid]) return mid;
            if(target<nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        BinarySearch obj = new BinarySearch();
        int[] input = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println("\nInput Arrays is: "+ Arrays.toString(input));
        System.out.println("target is : "+target);
        System.out.println("Found at index: "+obj.search(input, target));

        target = 2;
        System.out.println("target is : "+target);
        System.out.println("Found at index: "+obj.search(input, target));

    }
}

/*Sample Output:
Input Arrays is: [-1, 0, 3, 5, 9, 12]
target is : 9
Found at index: 4
target is : 2
Found at index: -1

 */
