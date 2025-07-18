//https://leetcode.com/problems/minimum-non-zero-product-of-the-array-elements/description/?envType=problem-list-v2&envId=recursion

//1969

//Medium

package Recursion;

public class MinimumNonzeroProductOfArrayElements {
    public static int mod = 1_000_000_007;
    public static int minNonZeroProduct(int p) {
        if (p == 1) return 1;

        long mx = (long)(Math.pow(2, p)) - 1;
        long sm = mx - 1;
        long n = sm/2;
        long sum = rec(sm, n);

        return (int)(sum * (mx % mod) % mod);
    }

    public static long rec(long val, long n) {
        if (n == 0) return 1;
        if (n == 1) return (val % mod);

        long newVal = ((val % mod) * (val % mod)) % mod;

        if (n % 2 != 0) {
            return ((rec(newVal, n/2) % mod) * (val % mod)) % mod;
        }

        return rec(newVal, n/2) % mod;
    }

    public static void main(String[] args){
        int n=1;
        System.out.println("\nGiven integer: "+n);
        System.out.println("The minimum non-zero product of nums after swapping Corresponding bit refers to the bit that is in the same position : "+minNonZeroProduct(n));
        n=2;
        System.out.println("\nGiven integer: "+n);
        System.out.println("The minimum non-zero product of nums after swapping Corresponding bit refers to the bit that is in the same position : "+minNonZeroProduct(n));

        n=3;
        System.out.println("\nGiven integer: "+n);
        System.out.println("The minimum non-zero product of nums after swapping Corresponding bit refers to the bit that is in the same position : "+minNonZeroProduct(n));

    }
}


/*Sample Output:

Given integer: 1
The minimum non-zero product of nums after swapping Corresponding bit refers to the bit that is in the same position : 1

Given integer: 2
The minimum non-zero product of nums after swapping Corresponding bit refers to the bit that is in the same position : 6

Given integer: 3
The minimum non-zero product of nums after swapping Corresponding bit refers to the bit that is in the same position : 1512


 */