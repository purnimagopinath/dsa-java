package Revision_V2.Medium;
//https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxFreq = 0;
        int ans = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int[] freq = new int[26];

        while(right<n){
            char r = s.charAt(right);
            freq[r-'A']++;
            maxFreq = Math.max(maxFreq, freq[r-'A']);
            while((right-left+1)-maxFreq>k){
                char l = s.charAt(left);
                freq[l-'A']--;
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }

        return ans;
    }


    public static void main(String[] args){
        String s = "ABAB";
        int k = 2;
        LongestRepeatingCharacterReplacement obj  = new LongestRepeatingCharacterReplacement();
        System.out.println("Input is: "+s+" k is: "+k);
        System.out.println("Longest repeating string length after replacing k chars is : "+obj.characterReplacement(s, k));

        s = "AABABBA";
        k = 1;
        System.out.println("Input is: "+s+" k is: "+k);
        System.out.println("Longest repeating string length after replacing k chars is : "+obj.characterReplacement(s, k));

    }
}

/*Sample Output :

Input is: ABAB k is: 2
Longest repeating string length after replacing k chars is : 4
Input is: AABABBA k is: 1
Longest repeating string length after replacing k chars is : 4

 */
