//https://leetcode.com/problems/powx-n/description/?envType=problem-list-v2&envId=recursion

//50
//Medium

package Recursion;

public class Pow {
    public static double myPow(double x, int n) {
        // Use long to avoid overflow with Integer.MIN_VALUE
        long N = n;
        if (N < 0) {
            x = 1.0 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private static double fastPow(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        if (N % 2 == 0) {
            // even exponent: (x^(N/2))^2
            double half = fastPow(x, N / 2);
            return half * half;
        } else {
            // odd exponent: x * (x^((N-1)/2))^2
            double half = fastPow(x, N / 2);
            return half * half * x;
        }
    }

    public static void main(String[] args){
        double x = 2.00000;
        int n = 10;
        System.out.println("\nGiven x and n : "+x+"  "+n);
        System.out.println("x to the power n is : "+myPow(x,n));

        x=2.10000;
        n=3;
        System.out.println("\nGiven x and n : "+x+"  "+n);
        System.out.println("x to the power n is : "+myPow(x,n));

        x=2.00000;
        n=-2;
        System.out.println("\nGiven x and n : "+x+"  "+n);
        System.out.println("x to the power n is : "+myPow(x,n));
    }
}

/*Sample Output:

Given x and n : 2.0  10
x to the power n is : 1024.0

Given x and n : 2.1  3
x to the power n is : 9.261000000000001

Given x and n : 2.0  -2
x to the power n is : 0.25

 */