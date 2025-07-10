//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/description/

//1385
//Easy

package BinarySearch;

import java.util.Arrays;

public class DistanceValueBetweenArrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int ele : arr1) {
            if (check(arr2, ele, d)) {
                count++;
            }
        }
        return count;
    }

    private static boolean check(int[] arr, int x, int d) {
        for(int el:arr)
        {
            if(Math.abs(x-el)<=d)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] input1= {4, 5, 8};
        int[] input2={10, 9, 1, 8};
        int d = 2;
        System.out.println("\nInput array1: "+ Arrays.toString(input1)+"\n Array2 :  "+Arrays.toString(input2));
        System.out.println("Distance Value between given arrays so that no element in arr1  and arr2 where |arr1[i]-arr2[j]| <= "+d +"  is: "+findTheDistanceValue(input1, input2, d));

        int[] input3= {1, 4, 2, 3};
        int[] input4={-4, -3, 6, 10, 20, 30};
        d = 3;
        System.out.println("\nInput array1: "+ Arrays.toString(input3)+"\n Array2 :  "+Arrays.toString(input4));
        System.out.println("Distance Value between given arrays so that no element in arr1  and arr2 where |arr1[i]-arr2[j]| <= "+d +"  is: "+findTheDistanceValue(input3, input4, d));

        int[] input5= {2, 1, 100, 3};
        int[] input6 ={-5,-2,10,-3,7};
        d = 6;
        System.out.println("\nInput array1: "+ Arrays.toString(input5)+"\n Array2 :  "+Arrays.toString(input6));
        System.out.println("Distance Value between given arrays so that no element in arr1  and arr2 where |arr1[i]-arr2[j]| <= "+d +"  is: "+findTheDistanceValue(input5, input6, d));
        //Try using binary search to check instead
    }
}

/*Sample Output:

Input array1: [4, 5, 8]
 Array2 :  [10, 9, 1, 8]
Distance Value between given arrays so that no element in arr1  and arr2 where |arr1[i]-arr2[j]| <= 2  is: 2

Input array1: [1, 4, 2, 3]
 Array2 :  [-4, -3, 6, 10, 20, 30]
Distance Value between given arrays so that no element in arr1  and arr2 where |arr1[i]-arr2[j]| <= 3  is: 2

Input array1: [2, 1, 100, 3]
 Array2 :  [-5, -2, 10, -3, 7]
Distance Value between given arrays so that no element in arr1  and arr2 where |arr1[i]-arr2[j]| <= 6  is: 1


 */