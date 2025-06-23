//https://www.geeksforgeeks.org/dsa/find-first-and-last-positions-of-an-element-in-a-sorted-array/

//https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1


package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastPositionsInArray {
    static ArrayList<Integer> find(int[] arr, int x) {
        // code here
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(-1, -1));
        int n=arr.length;
        if((arr[0]>x)||(arr[n-1]<x)){
            return arrList;
        }
        int left=n/2, right=n-1;
        if(arr[left]>x){
            right=left-1;
            left=0;
        }else{
            if(arr[left]==x){
                left=0;
            }
        }
        while(left<=right){
            if((arr[left]==x)&&(arrList.get(0)==-1)){
                arrList.set(0,left);
            }
            if((arr[right]==x)&&(arrList.get(1)==-1)){
                arrList.set(1, right);
            }
            left++;
            right--;
        }
        return arrList;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Target Element is: "+ target);
        System.out.println("First and Last Positions of target in Array: "+find(input1, target));

        int[] input2 = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        target = 7;
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Target Element is: "+ target);
        System.out.println("First and Last Positions of target in Array: "+find(input2, target));

        int[] input3 = {1, 2, 3};
        target = 4;
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Target Element is: "+ target);
        System.out.println("First and Last Positions of target in Array: "+find(input3, target));

        // check again 6 6 6 6 7 7 7 8
        //target=8
    }
}

/*Sample Output:

Input array: [1, 3, 5, 5, 5, 5, 67, 123, 125]
Target Element is: 5
First and Last Positions of target in Array: [2, 5]

Input array: [1, 3, 5, 5, 5, 5, 7, 123, 125]
Target Element is: 7
First and Last Positions of target in Array: [6, 6]

Input array: [1, 2, 3]
Target Element is: 4
First and Last Positions of target in Array: [-1, -1]

 */

