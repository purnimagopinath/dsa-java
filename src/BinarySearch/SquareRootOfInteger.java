//https://www.geeksforgeeks.org/dsa/square-root-of-an-integer/

//https://www.geeksforgeeks.org/problems/square-root/1


package BinarySearch;

import java.util.Arrays;

public class SquareRootOfInteger {
    static int floorSqrt(int n) {
        // Your code goes here
        int i=1, ans=1;
        while((i*i)<=n){
            ans=i;
            if((i*i)==n){
                break;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int target = 4;
        System.out.println("\nTarget Element is: "+ target);
        System.out.println("Nearest Square root:  "+floorSqrt(target));

        target=11;
        System.out.println("\nTarget Element is: "+ target);
        System.out.println("Nearest Square root:  "+floorSqrt(target));

        target=1;
        System.out.println("\nTarget Element is: "+ target);
        System.out.println("Nearest Square root:  "+floorSqrt(target));

    }
// Check if there are better ways to do it
}
/*Sample Output:

Target Element is: 4
Nearest Square root:  2

Target Element is: 11
Nearest Square root:  3

Target Element is: 1
Nearest Square root:  1

 */
