package Revision_V2.Medium;


import java.util.ArrayList;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        if(sLen<pLen || sLen==0) return new ArrayList<>();

        Map<Character, Integer> freq = new HashMap<>();
        for(char c:p.toCharArray()) freq.put(c, freq.getOrDefault(c,0)+1);

        int required = pLen;
        int left = 0, right = 0;
        List<Integer> ans = new ArrayList<>();
        while(right<sLen){
            char c = s.charAt(right);
            if(freq.containsKey(c)) {
                freq.put(c, freq.get(c) - 1);
                if (freq.get(c) >= 0) required--;
            }
            if(right-left+1>pLen){
                if(freq.containsKey(s.charAt(left))) {
                    freq.put(s.charAt(left), freq.get(s.charAt(left)) + 1);
                    if(freq.get(s.charAt(left))>0) required++;
                }
                left++;
            }

            if(right - left + 1 == pLen && required == 0){
                ans.add(left);
            }
            right++;
        }
        return ans;

    }

    public static void main(String[] args){
        FindAllAnagramsInString obj = new FindAllAnagramsInString();
        String s="cbaebabacd";
        String p = "abc";

        System.out.println("\nInput is s : "+s+"  p : "+p);
        System.out.println("Anagrams of p in s : "+ (obj.findAnagrams(s, p)));

        s= "abab";
        p = "ab"  ;

        System.out.println("\nInput is s : "+s+"  p : "+p);
        System.out.println("Anagrams of p in s : "+ (obj.findAnagrams(s, p)));


        s = "aaab";
        p = "aab";

        System.out.println("\nInput is s : "+s+"  p : "+p);
        System.out.println("Anagrams of p in s : "+ (obj.findAnagrams(s, p)));

    }
}


/*Sample Output:
Input is s : cbaebabacd  p : abc
Anagrams of p in s : [0, 6]

Input is s : abab  p : ab
Anagrams of p in s : [0, 1, 2]

Input is s : aaab  p : aab
Anagrams of p in s : [1]
 */