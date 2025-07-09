//https://leetcode.com/problems/power-of-three/?envType=problem-list-v2&envId=recursion

//326

//Easy
package Recursion;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3);

    }

    public static void main(String[] args){
        int s = 27;
        System.out.println("Given Number : "+s);
        System.out.println("Is power of Three: "+isPowerOfThree(s));
        s = 0 ;
        System.out.println("\nGiven Number: "+s);
        System.out.println("Is power of Three: "+isPowerOfThree(s));
        s = -1 ;
        System.out.println("\nGiven Number: "+s);
        System.out.println("Is power of Three: "+isPowerOfThree(s));

    }
}

/*Sample Output:

Given Number : 27
Is power of Three: true

Given Number: 0
Is power of Three: false

Given Number: -1
Is power of Three: false

 */