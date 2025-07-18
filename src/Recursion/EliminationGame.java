//https://leetcode.com/problems/elimination-game/description/?envType=problem-list-v2&envId=recursion

//390
//Medium

package Recursion;

public class EliminationGame {
    public static int lastRemaining(int n) {
        boolean left = true;
        int head = 1;
        int step =1;
        int remain = n;
        while(remain>1){
            if(left||((remain%2)==1)){
                head = head+step;
            }
            step = step*2;
            remain = remain/2;
            left = !left;
        }
        return head;
    }

    public static void main(String[] args){
        int n=9;
        System.out.println("\nGiven integer: "+n);
        System.out.println("The last number that remains is : "+lastRemaining(n));
        n=1;
        System.out.println("\nGiven integer: "+n);
        System.out.println("The last number that remains is : "+lastRemaining(n));

        n=10;
        System.out.println("\nGiven integer: "+n);
        System.out.println("The last number that remains is : "+lastRemaining(n));
        n=15;
        System.out.println("\nGiven integer: "+n);
        System.out.println("The last number that remains is : "+lastRemaining(n));
    }
}

/*SampleOutput:
Given integer: 9
The last number that remains is : 6

Given integer: 1
The last number that remains is : 1

Given integer: 10
The last number that remains is : 8

Given integer: 15
The last number that remains is : 8
 */