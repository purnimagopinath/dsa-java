//https://www.geeksforgeeks.org/dsa/check-two-strings-k-anagrams-not/

// https://www.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1


package strings;

public class KAnagrams {

    static boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }

        int n=s1.length();
        int[] hash1 = new int[26];

        for (int i = 0; i < n ; i++)
            hash1[s1.charAt(i)-'a']++;

        int count = 0;
        for (int i = 0; i < n ; i++)
        {
            if (hash1[s2.charAt(i)-'a'] > 0){
                hash1[s2.charAt(i)-'a']--;
            }
            else{
                count++;
            }

            if (count > k){
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args){
        String s1="fodr";
        String s2 = "gork";
        int k=2;
        System.out.println("Given Strings: "+s1+"  And: "+s2);
        System.out.println("Given Strings are kAnagrams: "+areKAnagrams(s1, s2, k));
        s1="geeks";
        s2="eggkf";
        k=1;
        System.out.println("\nGiven String: "+s1+"  And: "+s2);
        System.out.println("Given Strings are kAnagrams: "+areKAnagrams(s1, s2, k));
        s1="adb";
        s2="fdab";
        k=2;
        System.out.println("\nGiven String: "+s1+"  And: "+s2);
        System.out.println("Given Strings are kAnagrams: "+areKAnagrams(s1, s2, k));

    }
}

/*Sample Output:

Given Strings: fodr  And: gork
Given Strings are kAnagrams: true

Given String: geeks  And: eggkf
Given Strings are kAnagrams: false

Given String: adb  And: fdab
Given Strings are kAnagrams: false

 */