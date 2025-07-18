//https://leetcode.com/problems/find-the-winner-of-the-circular-game/

//Medium
//1823

package Recursion;

import java.util.ArrayList;

public class CircularGame {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = new ArrayList<>();
        for(int i=1; i<=n ; i++) {
            friends.add(i);
        }
        int currIndex = 0;
        while(friends.size()>1){
            currIndex = (currIndex+k-1)%friends.size();
            friends.remove(currIndex);
        }
        return friends.get(0);
    }

    public static void main(String[] args) {
        int n=5;
        int k=2;
        System.out.println("\n Given n: "+n+" \n Given k: "+k);
        System.out.println("Winner of the game is :"+findTheWinner(n,k));
        n=6;
        k=5;
        System.out.println("\n Given n: "+n+" \n Given k: "+k);
        System.out.println("Winner of the game is :"+findTheWinner(n,k));
    }
}

/*Sample Output:

Given n: 5
 Given k: 2
Winner of the game is :3

 Given n: 6
 Given k: 5
Winner of the game is :1
 */