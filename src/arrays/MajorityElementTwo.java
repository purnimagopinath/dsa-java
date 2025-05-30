//https://www.geeksforgeeks.org/find-all-array-elements-occurring-more-than-%E2%8C%8An-3%E2%8C%8B-times/
//https://www.geeksforgeeks.org/problems/majority-vote/1

package arrays;

import java.util.Arrays;

public class MajorityElementTwo {
    static int[] getMajorityElements(int[] arr){
        int n = arr.length;

        if (n==1){
            return arr;
        }
        //max two elements can occur majority since 3 >n/3 would be >n

        int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }


        count1 = 0;
        count2 = 0;
        for(int num : arr) {
            if(num == candidate1) {
                count1++;
            } else if(num == candidate2) {
                count2++;
            }
        }

        int[] result = new int[2];
        int index = 0;
        if(count1>n/3) {
            result[index] = candidate1;
            index++;
        }
        if(count2>n/3) {
            result[index] = candidate2;
            index++;
        }

        if(index == 0) {
            return new int[]{};
        } else {
            return Arrays.copyOf(result, index);
        }
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

/* Sample Output:

Input array: [2, 2, 3, 1, 3, 2, 1, 1]
Majority Elements are: [2, 1]

Input array: [-5, 3, -5]
Majority Elements are: [-5]

Input array: [3, 2, 2, 4, 1, 4]
Majority Elements  are: []
 */