//https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/

//https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
package strings;

public class NonRepeatingCharOfString {
    static char nonRepeatingChar(String s) {
        // code here
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a'] = freq[c - 'a']+1;
        }

        //ASCII Values
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '$';
    }

    public static void main(String[] args){
        String s="geeksforgeeks";
        System.out.println("Given String: "+s);
        System.out.println("First nonrepating char is : "+nonRepeatingChar(s));
        s="racecar";
        System.out.println("\nGiven String: "+s);
        System.out.println("First nonrepating char is : "+nonRepeatingChar(s));
        s="aabbccc";
        System.out.println("\nGiven String: "+s);
        System.out.println("First nonrepating char is : "+nonRepeatingChar(s));

    }
}

/*Sample Output:

Given String: geeksforgeeks
First nonrepating char is : f

Given String: racecar
First nonrepating char is : e

Given String: aabbccc
First nonrepating char is : $
 */