package Revision_V1.Easy;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;

        int[] freq = new int[126];
        Arrays.fill(freq,0);
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }

        for(int f:freq){
            if(f!=0) return false;
        }

        return true;
    }

    public static void main(String[] args){
        ValidAnagram obj = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        System.out.println("\nInput is :s =  "+s+"\nt = "+t);
        System.out.println("Is Anagram? : "+obj.isAnagram(s, t));

        s = "rat";
        t="car";
        System.out.println("\nInput is :s =  "+s+"\nt = "+t);
        System.out.println("Is Anagram? : "+obj.isAnagram(s, t));
    }
}


/*Sample Output:

Input is :s =  anagram
t = nagaram
Is Anagram? : true

Input is :s =  rat
t = car
Is Anagram? : false

 */