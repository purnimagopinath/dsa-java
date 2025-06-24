//https://www.geeksforgeeks.org/dsa/divisibility-by-7/

package Math;

public class DivisibleBy7 {

    public static boolean isDivBy7(int n) {
        if (n == 0 || n == 7)
            return true;

        while (n >= 10) {
            int lastD = n % 10;
            n = n / 10;
            n = Math.abs(n - 2 * lastD);
        }

        return n == 0 || n == 7;
    }

    public static void main(String[] args)
    {
        int n = 371;
        System.out.println("\nGiven number: "+n);
        System.out.println("Divisible by 7: "+isDivBy7(n));

        n=7673;
        System.out.println("\nGiven number: "+n);
        System.out.println("Divisible by 7: "+isDivBy7(n));

        n=1946;
        System.out.println("\nGiven number: "+n);
        System.out.println("Divisible by 7: "+isDivBy7(n));


    }
}
/*Sample Output:

Given number: 371
Divisible by 7: true

Given number: 7673
Divisible by 7: false

Given number: 1946
Divisible by 7: true
 */