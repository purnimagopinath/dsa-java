/*
Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.

Return an integer array denoting all the leader elements of the array.
1 <= N <= 105
1 <= A[i] <= 108

 */
package arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class LeadersInArray {
    public static int[] solve(int[] A) {
        int n = A.length;
        //Here we work backwards
        ArrayList<Integer> ans = new ArrayList<>();
        int max = A[n-1];
        ans.add(A[n-1]);
        //Right to left skipping the leftmost since it cant be a leader
        for(int i=n-2;i>=0;i--){
            if(A[i]>max){
                max=A[i];
                ans.add(A[i]);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] input1 = {16, 17, 4, 3, 5, 2};
        int[] input2 = {5, 4};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Leaders in Array are: "+Arrays.toString(solve(input1)) );

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Leaders in Array are: "+Arrays.toString(solve(input2)) );

    }

}

/*Sample Output:
 Input array: [16, 17, 4, 3, 5, 2]
Leaders in Array are: [2, 5, 17]

Input array: [5, 4]
Leaders in Array are: [4, 5]
*/

