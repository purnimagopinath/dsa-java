//https://leetcode.com/problems/fibonacci-number/description/?envType=problem-list-v2&envId=recursion

//Easy

package Recursion;

public class FibonacciNumber {
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        int s = 2;
        System.out.println("Given K : "+s);
        System.out.println("Fibonacci Sum is: "+fib(s));
        s = 3 ;
        System.out.println("\nGiven K: "+s);
        System.out.println("Fibonacci Sum is: "+fib(s));
        s = 4 ;
        System.out.println("\nGiven K: "+s);
        System.out.println("Fibonacci Sum is: "+fib(s));


    }
}

/*Sample Output:

Given K : 2
Fibonacci Sum is: 1

Given K: 3
Fibonacci Sum is: 2

Given K: 4
Fibonacci Sum is: 3


 */