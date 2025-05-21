//https://www.geeksforgeeks.org/problems/third-largest-element/1

//https://www.geeksforgeeks.org/third-largest-element-array-distinct-elements/

package arrays;

import java.util.Arrays;

public class ThirdLargestNumber {
    static int getThirdLargest(int[] arr) {
        // Your code here
        int n = arr.length;
        //we need third largest. so if array doesnt contain atleast three, return -1
        if(n<3){
            return -1;
        }
        //Finding First and second Largest
        int largest = arr[0];
        int second_largest = -1;
        int i=1;
        while(i<n){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }else{
                if(arr[i]>second_largest & arr[i]<largest){
                    second_largest = arr[i];
                }
            }
            i = i+1;
        }

        // now trying to find third largest
        int third_largest = -1;
        i=0;
        while(i<n){
            if(arr[i]<second_largest & arr[i]>third_largest){
                third_largest = arr[i];
            }
            i = i+1;
        }
        return third_largest;

    }

    public static void main(String[] args) {
        int[] input1 = {1, 14, 2, 16, 10, 20};
        int[] input2 = {19, -10, 20, 14, 2, 16, 10};
        int[] input3 = {10, 10, 10};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Third Largest number is: "+getThirdLargest(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Third Largest number is: "+getThirdLargest(input2) );
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Third Largest number is: "+getThirdLargest(input3) );

        int[] input4 = new int[]{2, 4, 1, 3, 5};
        System.out.println("\nInput array: "+ Arrays.toString(input4));
        System.out.println("Third Largest number is: "+getThirdLargest(input4) );

        input4 = new int[]{10,2};
        System.out.println("\nInput array: "+ Arrays.toString(input4));
        System.out.println("Third Largest number is: "+getThirdLargest(input4) );

        input4 = new int[]{5,5,5};
        System.out.println("\nInput array: "+ Arrays.toString(input4));
        System.out.println("Third Largest number is: "+getThirdLargest(input4) );

    }

// This solution however doesnt work for the following array:
    //855 450 132 359 233 825 604 481 262 337 720 525 652 300 906 219 926 906 293 864 817 498 30 639 661
    // Code didnt account for duplicates. Considered Distinct numbers as mentioned in the desciption !!
    // Code Output: 864
    // Correct Output: 906

}

/* Output:
Input array: [1, 14, 2, 16, 10, 20]
Third Largest number is: 14

Input array: [19, -10, 20, 14, 2, 16, 10]
Third Largest number is: 16

Input array: [10, 10, 10]
Third Largest number is: -1

Input array: [2, 4, 1, 3, 5]
Third Largest number is: 3

Input array: [10, 2]
Third Largest number is: -1

Input array: [5, 5, 5]
Third Largest number is: -1

 */