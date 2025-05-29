/*
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.

If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Note: Read-only array means that the input array should not be modified in the process of solving the problem
1 <= N <= 7*10^5
1 <= A[i] <= 10^9
 */
package arrays;

import java.util.Arrays;
import java.util.List;


public class RepeatNumberN3 {
    public static int repeatedNumber(final List<Integer> a) {
        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;

        for (int num : a) {
            if (candidate1 != null && candidate1.equals(num)) {
                count1++;
            } else if (candidate2 != null && candidate2.equals(num)) {
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
        for (int num : a) {
            if (candidate1.equals(num)) {
                count1++;
            }
            if (candidate2 != null && candidate2.equals(num)) {
                count2++;
            }
        }

        if(count1>(a.size()/3)){
            return candidate1;
        }else if(count2>a.size()/3){
            return candidate2;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(1, 2, 3, 1, 1);
        List<Integer> input2 = Arrays.asList(1, 2, 3);
        List<Integer> input3 = Arrays.asList(1, 1, 1, 2, 3, 5, 7);
        System.out.println("Input array: "+ input1);
        System.out.println("Majority Element is: "+repeatedNumber(input1) );
        System.out.println("\nInput array: "+input2);
        System.out.println("Majority Element  is: "+repeatedNumber(input2) );
        System.out.println("\nInput array: "+input3);
        System.out.println("Majority Element  is: "+repeatedNumber(input3) );

    }




}
/*Sample Output:

Input array: [1, 2, 3, 1, 1]
Majority Element is: 1

Input array: [1, 2, 3]
Majority Element  is: -1

Input array: [1, 1, 1, 2, 3, 5, 7]
Majority Element  is: 1

 */