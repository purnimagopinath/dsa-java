package Revision_V1.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        if(n<1) return "";
        if(n==1) return strs[0];

        Arrays.sort(strs);

        int len = Math.min(strs[0].length(), strs[n-1].length());
        if(len==0) return "";
        if(strs[0].charAt(0)!=strs[n-1].charAt(0)) return "";
        StringBuilder ans  = new StringBuilder();
        for(int i=0;i<len;i++){
            if(strs[0].charAt(i)==strs[n-1].charAt(i)){
                ans.append(strs[0].charAt(i));
            }else{
                return ans.toString();
            }
        }
        return ans.toString();
    }

    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        System.out.println("\nInput is :"+ Arrays.toString(strs));
        System.out.println(obj.longestCommonPrefix(strs));
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("\nInput is :"+ Arrays.toString(strs2));
        System.out.println(obj.longestCommonPrefix(strs2));
    }
}
