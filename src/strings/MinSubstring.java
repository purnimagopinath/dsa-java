package strings;

import java.util.HashMap;

public class MinSubstring {
    public static void main(String[] args){
        String s = "abc";
        String p = "cab";
        System.out.println("Input : s= "+s+" p = "+p);
        System.out.println(findSub(s,p));
//
        s="timetopractice";
        p="toc";
        System.out.println("Input : s= "+s+" p = "+p);
        System.out.println(findSub(s,p));

        s="zoomlazapzo";
        p="oza";
        System.out.println("Input : s= "+s+" p = "+p);
        System.out.println(findSub(s,p));

        s="zoomlazapzo";
        p="ozazoomlazapzo";
        System.out.println("Input : s= "+s+" p = "+p);
        System.out.println(findSub(s,p));
//
        s="oza";
        p="oza";
        System.out.println("Input : s= "+s+" p = "+p);
        System.out.println(findSub(s,p));
    }

    public static String findSub(String s, String p){
        if(p.length()>s.length()) return "";
        if(p.equals(s)) return p;

        //s= timetopractice , p = toc

        HashMap<Character, Integer> pFreq = new HashMap<>();
        for(char c:p.toCharArray()){
            pFreq.put(c, pFreq.getOrDefault(c,0)+1);
        }

        //t->1
        //o->1
        //c->1

        HashMap<Character, Integer> freq = new HashMap<>();

        int left = 0, right = 0, count = 0;
        int lIdx = 0, rIdx = Integer.MAX_VALUE;

        while(left<=right && right<s.length()) {
            char c = s.charAt(right);
            if (pFreq.containsKey(c)) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
                if (freq.get(c) <= pFreq.get(c)) {
                    count++;
                }
            }
            right++;
            while(count == p.length()) {
                if ((right - left) < (rIdx - lIdx)) {
                    lIdx = left;
                    rIdx = right;
                }

                char lChar = s.charAt(left);
                if (pFreq.containsKey(lChar)) {
                    freq.put(lChar, freq.get(lChar) - 1);
                    if (freq.get(lChar) < pFreq.get(lChar)) {
                        count--;
                    }
                }
                left++;
            }

        }
        return s.substring(lIdx,rIdx);
    }
}

/*Sample Output

Input : s= abc p = cab
abc
Input : s= timetopractice p = toc
toprac
Input : s= zoomlazapzo p = oza
apzo
Input : s= zoomlazapzo p = ozazoomlazapzo

Input : s= oza p = oza
oza
 */