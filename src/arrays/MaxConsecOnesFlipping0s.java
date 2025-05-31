//https://www.geeksforgeeks.org/find-zeroes-to-be-flipped-so-that-number-of-consecutive-1s-is-maximized/
//https://www.geeksforgeeks.org/problems/maximize-number-of-1s0905/1

package arrays;

import java.util.Arrays;

public class MaxConsecOnesFlipping0s {
    public static int maxOnes(int[] arr, int k) {
        // code here
        int n=arr.length;
        int totalOnes = 0;
        for(int num:arr){
            if(num==1){
                totalOnes++;
            }
        }
        if(((k+totalOnes)==n||(k==n)||(totalOnes==n))){
            return n;
        }
        int maxOnes=0;
        int oneCount=0, zeroCount=0, left=0;
        for (int j : arr) {
            if (j == 1) {
                oneCount++;
            }
            if (j == 0) {
                if (zeroCount >= k) {
                    while (zeroCount >= k) {
                        if (arr[left] == 1) {
                            oneCount--;
                        } else if (arr[left] == 0) {
                            zeroCount--;
                        }
                        left++;
                    }
                }
                zeroCount++;
            }
            maxOnes = Math.max(maxOnes, oneCount + zeroCount);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 0,1};
        int[] input2 = {1, 0,0,1,0, 1,0,1};
        int[] input3 = {1,1};
        int k = 1;
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Consecutive One's that can be obtained after : "+k+" flips is: "+maxOnes(input1, k));
        System.out.println("\nInput array: "+Arrays.toString(input2));
        k=2;
        System.out.println("Consecutive One's that can be obtained after : "+k+" flips is: "+maxOnes(input2, k));

        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Consecutive One's that can be obtained after : "+k+" flips is: "+maxOnes(input3, k));
    }


}

/*Sample Output:

Input array: [1, 0, 1]
Consecutive One's that can be obtained after : 1 flips is: 3

Input array: [1, 0, 0, 1, 0, 1, 0, 1]
Consecutive One's that can be obtained after : 2 flips is: 5

Input array: [1, 1]
Consecutive One's that can be obtained after : 2 flips is: 2
 */