//https://leetcode.com/problems/count-collisions-of-monkeys-on-a-polygon/description/?envType=problem-list-v2&envId=recursion

//2550

//Medium

package Recursion;

public class CountCollisionOfMonkeysOnPolygon {
    static int mod = 1_000_000_007;
    public static int monkeyMove(int n) {
        int  exp =(int) pow(2,n)%mod;
        return (int) (exp + mod - 2) % mod;
    }

    private static long pow(long a, long b){
        if(b == 0) return 1;
        long temp = pow(a,b/2);
        long ans = temp * temp % mod;
        if(b % 2 == 1 )
            ans = ans * a % mod;
        return ans;
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println("\nGiven n: "+n);
        System.out.println("No of ways monkeys can collide are: "+monkeyMove(n));
        n = 4;

        System.out.println("\nGiven n: "+n);
        System.out.println("No of ways monkeys can collide are: "+monkeyMove(n));

    }
}


/*Sample Output:

Given n: 3
No of ways monkeys can collide are: 6

Given n: 4
No of ways monkeys can collide are: 14


 */