package Revision_V1.Easy;

import java.util.HashMap;

//https://leetcode.com/problems/ransom-note/description/
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c:magazine.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(char c:ransomNote.toCharArray()){
            if(!freq.containsKey(c)) return false;
            if(freq.get(c)<=0) return false;
            freq.put(c, freq.get(c)-1);
        }

        return true;
    }

    public static void main(String[] args){
        String ransome = "a";
        String magazine = "b";
        RansomNote obj = new RansomNote();
        System.out.println("\nRansom is :" +ransome+" magazine is :"+magazine);
        System.out.println("Can make ransom note? "+obj.canConstruct(ransome, magazine));

        ransome = "aa";
        magazine = "ab";
        System.out.println("\nRansom is :" +ransome+" magazine is :"+magazine);
        System.out.println("Can make ransom note? "+obj.canConstruct(ransome, magazine));

        ransome = "aa";
        magazine = "aaba";
        System.out.println("\nRansom is :" +ransome+" magazine is :"+magazine);
        System.out.println("Can make ransom note? "+obj.canConstruct(ransome, magazine));
    }
}

/*Sample Output:
Ransom is :a magazine is :b
Can make ransom note? false

Ransom is :aa magazine is :ab
Can make ransom note? false

Ransom is :aa magazine is :aaba
Can make ransom note? true
 */