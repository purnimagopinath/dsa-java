/*

A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.
0 <= N <= 5×105
0 <= A[i] <= 1

Return an integer representing the minimum number of switches required.
 */

package arrays;

import java.util.Arrays;

public class Bulbs {
    public static int solve(int[] A) {
        //All 1's array is the goal
        // if we change 0, all to its right change -> 1, 0, 1, 0
        int timesChanged = 0;
        int switchCount = 0;
        for(int num :A){
            if(timesChanged%2==0){
                if(num==0){
                    switchCount++;
                    timesChanged++;
                }
            }else{
                if(num==1){
                    switchCount++;
                    timesChanged++;
                }
            }
        }
        return switchCount;
    }

    public static void main(String[] args) {
        int[] input1 = {0,1,0,1};
        int[] input2 = {1, 1, 1, 1};
        int[] input3 = {1, 1, 0, 1, 0, 0, 1};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Minimum No of switches to turn on all bulbs is: "+solve(input1));

        System.out.println("\nInput array: "+ Arrays.toString(input2));
        System.out.println("Minimum No of switches to turn on all bulbs is : "+solve(input2));

        System.out.println("\nInput array: "+ Arrays.toString(input3));
        System.out.println("Minimum No of switches to turn on all bulbs is : "+solve(input3));

    }
}

/* Sample Output:

Input array: [0, 1, 0, 1]
Minimum No of switches to turn on all bulbs is: 4

Input array: [1, 1, 1, 1]
Minimum No of switches to turn on all bulbs is : 0

Input array: [1, 1, 0, 1, 0, 0, 1]
Minimum No of switches to turn on all bulbs is : 4
 */