//https://leetcode.com/problems/power-of-four/?envType=problem-list-v2&envId=recursion

//342
//Easy

package Recursion;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        // int pow = 0;
        // while((1<<(2*pow)) < n){
        //     pow++ ;
        // }
        // return ((1<<(2*pow)) == n) ;
        if (n == 1) {
            return true;
        }
        if (n <= 0 || (n % 4 != 0)) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }
    // public boolean isPowerOfFour(int n) {
//     // Must be > 0, a power of two, and the single '1' bit must be in an even position
//     return n > 0
//         && (n & (n - 1)) == 0           // exactly one bit set (power of 2)
//         && (n & 0xAAAAAAAA) == 0;      // bitmask filters out 2, 8, 32… not powers of 4
// }

//without loops and recursion

    public static void main(String[] args){
        int s = 16;
        System.out.println("Given Number : "+s);
        System.out.println("Is power of Four: "+isPowerOfFour(s));
        s = 5 ;
        System.out.println("\nGiven Number: "+s);
        System.out.println("Is power of Four: "+isPowerOfFour(s));
        s = 1 ;
        System.out.println("\nGiven Number: "+s);
        System.out.println("Is power of Four: "+isPowerOfFour(s));

    }

}

/*Sample Output:

Given Number : 16
Is power of Four: true

Given Number: 5
Is power of Four: false

Given Number: 1
Is power of Four: true
 */