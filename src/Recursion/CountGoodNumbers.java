//https://leetcode.com/problems/count-good-numbers/?envType=problem-list-v2&envId=recursion

//1922
//Medium

package Recursion;

public class CountGoodNumbers {
    private static final int MOD = 1_000_000_007;

    public static int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenWays = power(5, evenCount);
        long oddWays = power(4, oddCount);

        return (int)((evenWays * oddWays) % MOD);

    }

    private static long power(long base, long exp) {
        long result = 1;
        base = base % MOD;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }

        return result;
    }

    public static void main(String[] args){
        long n = 1;
        System.out.println("\nGiven n: "+n);
        System.out.println("Good numbers of length n are: "+countGoodNumbers(n));
        n = 4;
        System.out.println("\nGiven n: "+n);
        System.out.println("Good numbers of length n are: "+countGoodNumbers(n));
        n=50;
        System.out.println("\nGiven n: "+n);
        System.out.println("Good numbers of length n are: "+countGoodNumbers(n));
    }
}

/*Sample Output:

Given n: 1
Good numbers of length n are: 5

Given n: 4
Good numbers of length n are: 400

Given n: 50
Good numbers of length n are: 564908303
 */