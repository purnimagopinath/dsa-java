package Revision_V2.Hard;
//https://leetcode.com/problems/minimum-window-substring/description/
//String
//SlidingWindow
public class MinWindowSubString {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen<tLen) return "";
        if(sLen==0) return "";

        int[] freq = new int[128];
        int start = 0, left = 0, right = 0, minLen = Integer.MAX_VALUE;
        int required = tLen;

        for(char c:t.toCharArray()) freq[c]++;

        while(right<sLen){
            char c = s.charAt(right);
            freq[c]--;
            if(freq[c]>=0){
                required--;
            }
            while(required==0){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start = left;
                }

                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    required++;
                }
                left++;
            }
            right++;
        }

        return minLen==Integer.MAX_VALUE? "":s.substring(start, start+minLen);

    }

    public static void main(String[] args){
        MinWindowSubString obj = new MinWindowSubString();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("\nInput s and t are "+s+"  "+t);
        System.out.println("Min window substring is "+obj.minWindow(s,t));

        s="bbbbbbb";
        t="b";
        System.out.println("\nInput s and t are "+s+"  "+t);
        System.out.println("Min window substring is "+obj.minWindow(s,t));


        s="a";
        t="aa";
        System.out.println("\nInput s and t are "+s+"  "+t);
        System.out.println("Min window substring is "+obj.minWindow(s,t));
    }
}
/*Sample Output:

Input s and t are ADOBECODEBANC  ABC
Min window substring is BANC

Input s and t are bbbbbbb  b
Min window substring is b

Input s and t are a  aa
Min window substring is

 */