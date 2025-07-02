//https://www.geeksforgeeks.org/find-maximum-product-of-a-triplet-in-array/
//https://www.geeksforgeeks.org/problems/three-great-candidates0515/1

//Easy

package arrays;
import java.util.Arrays;

public class ThreeGreatCandidates {
    static int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        //Assuming n>=3 always
        int n = arr.length;
        int max = arr[n-1]*arr[n-2]*arr[n-3];
        if(arr[0] < 0){
            max = Math.max(arr[0]*arr[1]*arr[n-1], max);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] input1 = {10, 3, 5, 6, 20};
        int[] input2 = {-10, -3, -5, -6, -20};
        int[] input3 = {1, -4, 3, -6, 7, 0};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Maximum product obtained using three elements from the array is: "+maxProduct(input1) );
        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Maximum product obtained using three elements from the array is: "+maxProduct(input2));
        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Maximum product obtained using three elements from the array is: "+maxProduct(input3));


    }
}

/*Sample output:
Input array: [10, 3, 5, 6, 20]
Maximum product obtained using three elements from the array is: 1200

Input array: [-10, -3, -5, -6, -20]
Maximum product obtained using three elements from the array is: -90

Input array: [1, -4, 3, -6, 7, 0]
Maximum product obtained using three elements from the array is: 168
 */