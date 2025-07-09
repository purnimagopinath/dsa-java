//https://leetcode.com/problems/power-of-two/?envType=problem-list-v2&envId=recursion

//231
//Easy

package Recursion;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n%2==0){
            n=n/2;
        }
        return n==1;
    }
    public static void main(String[] args){
        int s = 1;
        System.out.println("Given Number : "+s);
        System.out.println("Is power of Two: "+isPowerOfTwo(s));
        s = 16 ;
        System.out.println("\nGiven Number: "+s);
        System.out.println("Is power of Two: "+isPowerOfTwo(s));
        s = 3 ;
        System.out.println("\nGiven Number: "+s);
        System.out.println("Is power of Two: "+isPowerOfTwo(s));

    }
}

/*Sample Output:

Given Number : 1
Is power of Two: true

Given Number: 16
Is power of Two: true

Given Number: 3
Is power of Two: false
 */