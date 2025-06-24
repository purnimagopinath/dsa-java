//https://www.geeksforgeeks.org/dsa/assign-stalls-to-k-cows-to-maximize-the-minimum-distance-between-them/

//https://www.geeksforgeeks.org/problems/aggressive-cows/1

//Medium


package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

    public static boolean canPlaceCows(int[] stalls, int k, int minDist) {
        int lastPos = stalls[0];
        int count = 1; // First cow placed

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDist) {
                count++;
                lastPos = stalls[i];
                if (count == k) return true;
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int res = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(stalls, k, mid)) {
                res = mid;       // Update result, try for a better (larger) distance
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] input1 = {1, 2, 4, 8, 9};
        int target = 3;

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Number of Cows: "+ target);
        System.out.println("Minimum maximum distance is: "+aggressiveCows(input1, target));

        int[] input2 = {10, 1, 2, 7, 5};
        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Number of Cows: "+ target);
        System.out.println("Minimum maximum distance is: "+aggressiveCows(input2, target));

        int[] input3 = {2, 12, 11, 3, 26, 7};
        target=5;
        System.out.println("\nInput array: "+ Arrays.toString(input3));
        System.out.println("Number of Cows: "+ target);
        System.out.println("Minimum maximum distance is: "+aggressiveCows(input3, target));

    }
}
/*Sample Output:

Input array: [1, 2, 4, 8, 9]
Number of Cows: 3
Minimum maximum distance is: 3

Input array: [10, 1, 2, 7, 5]
Number of Cows: 3
Minimum maximum distance is: 4

Input array: [2, 12, 11, 3, 26, 7]
Number of Cows: 5
Minimum maximum distance is: 1
 */