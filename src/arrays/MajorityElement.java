//Medium

//https://www.geeksforgeeks.org/majority-element/

//https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
package arrays;

import java.util.Arrays;

public class MajorityElement {

    static int getMajorityElement(int[] arr){
        int n = arr.length;
        //If only one element then we can return it
        if (n==1){
            return arr[0];
        }
        int majority_ele = arr[0];
        int max_count = 1;
        int current_count;
        int current_ele;
        for(int i = 0; i<n; i++){
            current_ele = arr[i];
            current_count=1;

            for(int j=i+1;j<n;j++){
                if(current_ele==arr[j]){
                    current_count++;
                }
            }
            if(current_count>max_count){
                max_count = current_count;
                majority_ele = current_ele;
            }
            if(max_count>(n/2)){
                break;
            }
        }
        if(max_count>(n/2)){
            return majority_ele;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 1, 2, 1, 3, 5, 1};
        int[] input2 = {7};
        int[] input3 = {2, 13};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Majority Element is: "+getMajorityElement(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Majority Element  is: "+getMajorityElement(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Majority Element  is: "+getMajorityElement(input3) );

    }
    //Your program took more time than expected.Expected Time Limit : 1.73sec
    // Complexity is O(n^2)
    //Maybe use Something like hash to keep track of count and then iterate over it
}

/*Output:

Input array: [1, 1, 2, 1, 3, 5, 1]
Majority Element is: 1

Input array: [7]
Majority Element  is: 7

Input array: [2, 13]
Majority Element  is: -1
 */
