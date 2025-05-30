/*

https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1
 */
package arrays;

import java.util.Arrays;

public class MinimizeHeights2 {
    //Visit Agaiin
    static int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        //sorting array
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int minDiff = arr[n-1]-arr[0];
//        int midPoint=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]-k<=0){
//                midPoint++;
//            }
//        }
//        if(!(midPoint>=n||midPoint==0)) {
//            int shortest = Math.min(arr[midPoint] - k, arr[0] + k);
//            int longest = Math.max(arr[n - 1] - k, arr[midPoint - 1] + k);
//            minHeight = Math.min(minHeight, longest - shortest);
//        }

        for (int i = 1; i < n; i++) {
            // Calculate the new minimum and maximum heights
            int minHeight = Math.min(arr[0] + k, arr[i] - k);
            int maxHeight = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            // Ensure no negative heights
            if (minHeight < 0) continue;

            // Update the result with the minimum difference
            minDiff = Math.min(minDiff, maxHeight - minHeight);
        }

        return minDiff;
    }
    public static void main(String[] args) {
        int[] input1 = {1, 5,8,10};
        int[] input2 = {3, 9, 12, 16, 20};
        int[] input3 = {1, 8, 10, 6, 4, 6, 9, 1};
        int[] input4= {4,3,9};
        int[] input5={1 ,1 ,1 ,10 ,3 ,2 ,6 ,9 ,9 ,8};
        int k=2;

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Given k is: "+k);
        System.out.println("Minimum possible height difference is:"+getMinDiff(input1, k) );
        k=3;
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Given k is: "+k);
        System.out.println("Minimum possible height difference is:"+getMinDiff(input2, k));
        k=7;
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Given k is: "+k);
        System.out.println("Minimum possible height difference is:"+getMinDiff(input3, k));
        k=10;
        System.out.println("\nInput array: "+Arrays.toString(input4));
        System.out.println("Given k is: "+k);
        System.out.println("Minimum possible height difference is:"+getMinDiff(input4, k));
        k=2;
        System.out.println("\nInput array: "+Arrays.toString(input5));
        System.out.println("Given k is: "+k);
        System.out.println("Minimum possible height difference is:"+getMinDiff(input5, k));

    }
}
