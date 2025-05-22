//https://www.geeksforgeeks.org/move-zeroes-end-array/

// https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

package arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    static int[] moveZeroesToEnd(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                boolean found = false;
                int j = i+1;
                while((!found)&&(j<n)){
                    if(arr[j]!=0){
                        found = true;
                    }else{
                        j++;
                    }
                }
                if(found) {
                    arr[i]=arr[j];
                    arr[j]=0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] input2 = {0, 0};
        int[] input3 = {10, 20, 30};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("After moving zeroes to the end: "+Arrays.toString(moveZeroesToEnd(input1)));
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("After moving zeroes to the end: "+Arrays.toString(moveZeroesToEnd(input2)));
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("After moving zeroes to the end: "+Arrays.toString(moveZeroesToEnd(input3)));

    }
    // Because we have a loop within loop, it can exceep time limit
    // O(n^2)
    //Try counting number of 0's
}
/*Sample Output

Input array: [1, 2, 0, 4, 3, 0, 5, 0]
After moving zeroes to the end: [1, 2, 4, 3, 5, 0, 0, 0]

Input array: [0, 0]
After moving zeroes to the end: [0, 0]

Input array: [10, 20, 30]
After moving zeroes to the end: [10, 20, 30]

 */