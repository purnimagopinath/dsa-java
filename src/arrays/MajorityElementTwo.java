//https://www.geeksforgeeks.org/find-all-array-elements-occurring-more-than-%E2%8C%8An-3%E2%8C%8B-times/
//https://www.geeksforgeeks.org/problems/majority-vote/1

package arrays;

import java.util.Arrays;

public class MajorityElementTwo {
    static int[] getMajorityElements(int[] arr){
        int n = arr.length;
        //If only one element then we can return it
        if (n==1){
            return arr;
        }
        int[] majority_elements = new int[n/3];

        int majority_ele = arr[0];
        int max_count = 0;
        int ele_index = 0;
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
            if(max_count>(n/3)){
                majority_elements[ele_index]=majority_ele;
                ele_index++;
            }
        }
        if(max_count!=0){
            return majority_elements;
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] input1 = {2, 2, 3, 1, 3, 2, 1, 1};
        int[] input2 = {-5, 3, -5};
        int[] input3 = {3, 2, 2, 4, 1, 4};
        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Majority Elements are: "+Arrays.toString(getMajorityElements(input1) ));
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Majority Elements are: "+Arrays.toString(getMajorityElements(input2)) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Majority Elements  are: "+Arrays.toString(getMajorityElements((input3))));

    }
    //List should be returned. Postponing this till I understand how to use lists

}
