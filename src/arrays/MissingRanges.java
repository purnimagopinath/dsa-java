//https://www.geeksforgeeks.org/missing-ranges-of-numbers/
//https://www.geeksforgeeks.org/problems/missing-ranges-of-numbers1019/1

//Easy

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
    public static List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // code here
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();

        if (lower < arr[0]) {
            res.add(Arrays.asList(lower, arr[0]-1));
        }

        for (int i=0 ; i<n-1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                res.add(Arrays.asList(arr[i]+1, arr[i + 1]-1));
            }
        }

        if (upper > arr[n-1]) {
            res.add(Arrays.asList(arr[n - 1]+1, upper));
        }

        return res;
    }

    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int[] arr = {14, 15, 20, 30, 31, 45};
        List<List<Integer>> res = missingRanges(arr, lower, upper);
        System.out.println("\n Input Array: "+Arrays.toString(arr)) ;
        System.out.println("Lower : "+lower+"  Upper: "+upper);
        System.out.println("Missing ranges are: ");
        for (List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }

        int[] arr2 = {-48, -10, -6, -4, 0, 4, 17};
        lower = -54 ; upper = 17 ;
        res = missingRanges(arr2, lower, upper);
        System.out.println("\n Input Array: "+Arrays.toString(arr2)) ;
        System.out.println("Lower : "+lower+"  Upper: "+upper);
        System.out.println("Missing ranges are: ");
        for (List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }

        int[] arr3 = {15, 16, 17, 18};
        lower = 15 ; upper = 18 ;
        res = missingRanges(arr3, lower, upper);
        System.out.println("\n Input Array: "+Arrays.toString(arr3)) ;
        System.out.println("Lower : "+lower+"  Upper: "+upper);
        System.out.println("Missing ranges are: ");
        for (List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }
    }
}

/*Sample Output:

Input Array: [14, 15, 20, 30, 31, 45]
Lower : 10  Upper: 50
Missing ranges are:
10 13
16 19
21 29
32 44
46 50

 Input Array: [-48, -10, -6, -4, 0, 4, 17]
Lower : -54  Upper: 17
Missing ranges are:
-54 -49
-47 -11
-9 -7
-5 -5
-3 -1
1 3
5 16

 Input Array: [15, 16, 17, 18]
Lower : 15  Upper: 18
Missing ranges are:


 */