//https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/

//https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1

package strings;

public class FirstNonRepeatingChar {
    static char nonRepeatingChar(String s) {
        // code here
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            boolean found = false;

            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return s.charAt(i);
        }

        return '$';
    }

    public static void main(String[] args){
        String s="geeksforgeeks";
        System.out.println("Given String: "+s);
        System.out.println("First non-repeating char is: "+nonRepeatingChar(s));
        s="racecar";
        System.out.println("\nGiven String: "+s);
        System.out.println("First non-repeating char is: "+nonRepeatingChar(s));
        s="aabbccc";
        System.out.println("\nGiven String: "+s);
        System.out.println("First non-repeating char is: "+nonRepeatingChar(s));
    }
}


/*Sample Output:

Given String: geeksforgeeks
First non-repeating char is: f

Given String: racecar
First non-repeating char is: e

Given String: aabbccc
First non-repeating char is: $
 */