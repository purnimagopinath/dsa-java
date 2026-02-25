package Revision_V1.Easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-palindrome/description/
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        Set<Character> chars = new HashSet<>();
        int count = 0;
        for(char c:s.toCharArray()){
            if(chars.contains(c)){
                chars.remove(c);
                count+=2;
            }else{
                chars.add(c);
            }
        }
        if(chars.size()>0) count++;
        return count;
    }

    public static void main(String[] args){
        String s = "abccccdd";
        LongestPalindrome obj = new LongestPalindrome();
        System.out.println("\nInput is :"+s);
        System.out.println(obj.longestPalindrome(s));

        s = "a";
        System.out.println("\nInput is :"+s);
        System.out.println(obj.longestPalindrome(s));
    }
}
/*Sample Output
Input is :abccccdd
7

Input is :a
1

 */