package Revision_V2.Medium;
//string
//slidingwindow
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstrWORepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        for(int right = 0;right<n;right++){
            Character c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }

    public static void main(String[] args){
        String s = "abcabcbb";
        LongestSubstrWORepeatingChars obj  = new LongestSubstrWORepeatingChars();
        System.out.println("Input is: "+s);
        System.out.println("Max length of substring without repeating characters is: "+obj.lengthOfLongestSubstring(s));

        s = "bbbbb";
        System.out.println("Input is: "+s);
        System.out.println("Max length of substring without repeating characters is: "+obj.lengthOfLongestSubstring(s));

        s = "pwwkew";
        System.out.println("Input is: "+s);
        System.out.println("Max length of substring without repeating characters is: "+obj.lengthOfLongestSubstring(s));
    }
}
