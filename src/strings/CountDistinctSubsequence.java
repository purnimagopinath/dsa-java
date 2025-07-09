//https://www.geeksforgeeks.org/dsa/count-distinct-subsequences/

//https://www.geeksforgeeks.org/problems/number-of-distinct-subsequences0909/1

//Easy

//Dynamic Programming

package strings;

import java.util.Arrays;

public class CountDistinctSubsequence {
    static int distinctSubsequences(String s) {
        // code here
        int n = s.length();
        int[] distinctSubs = new int[n+1];
        int[] prevOccurence = new int[256];

        Arrays.fill(prevOccurence, -1);

        distinctSubs[0] = 1;

        for (int i = 1; i <= n; i++) {
            distinctSubs[i] = 2 * distinctSubs[i - 1];
            char c = s.charAt(i-1);

            if (prevOccurence[c]!= -1) {
                distinctSubs[i]-= distinctSubs[prevOccurence[c]];
            }

            prevOccurence[c] = i-1;
        }

        return distinctSubs[n];

    }
    public static void main(String[] args) {
        String s="gfg";
        System.out.println("Given String: "+s);
        System.out.println("Distinct Subseq count is : "+distinctSubsequences(s));
        s="ggg";
        System.out.println("\nGiven String: "+s);
        System.out.println("Distinct Subseq count is : : "+distinctSubsequences(s));
        s="abcbac";
        System.out.println("\nGiven String: "+s);
        System.out.println("Distinct Subseq count is : : "+distinctSubsequences(s));

    }

    //Probably can use hash instead of prevoccu array
}

/*Sampl eOutput:

Given String: gfg
Distinct Subseq count is : 7

Given String: ggg
Distinct Subseq count is : : 4

Given String: abcbac
Distinct Subseq count is : : 50
 */