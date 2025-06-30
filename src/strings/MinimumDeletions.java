//https://www.geeksforgeeks.org/minimum-number-deletions-make-string-palindrome/

//https://www.geeksforgeeks.org/problems/minimum-deletitions1648/1

package strings;

public class MinimumDeletions {
    static int minDeletions(String s) {
        // code here
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];

    }

    public static void main(String[] args){
        String s="aebcbda";
        System.out.println("Given String: "+s);
        System.out.println("Min Deletions to Palindrome: "+minDeletions(s));
        s="geeksforgeeks";
        System.out.println("\nGiven String: "+s);
        System.out.println("Min Deletions to Palindrome: "+minDeletions(s));
        s="aba";
        System.out.println("\nGiven String: "+s);
        System.out.println("Min Deletions to Palindrome: "+minDeletions(s));
        s="aedghgdeabck";
        System.out.println("\nGiven String: "+s);
        System.out.println("Min Deletions to Palindrome: "+minDeletions(s));
    }
    // This has multiple solutions, check other approaches as well
}

/*Sample Output:

Given String: aebcbda
Min Deletions to Palindrome: 2

Given String: geeksforgeeks
Min Deletions to Palindrome: 8

Given String: aba
Min Deletions to Palindrome: 0

Given String: aedghgdeabck
Min Deletions to Palindrome: 3

 */