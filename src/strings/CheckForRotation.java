//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/

//https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1
package strings;

public class CheckForRotation {
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        return ((s1.length() == s2.length()) && (s1 + s1).contains(s2));

//        int n = s1.length();
//
//        // Generate and check all possible rotations of s1
//        for (int i = 0; i < n; ++i) {
//
//            if (s1.equals(s2)) {
//                return true;
//            }
//            char last = s1.charAt(s1.length() - 1);
//            s1 = last + s1.substring(0, s1.length() - 1);
//        }
//        return false;
    }

    public static void main(String[] args){
        String s1="abcd";
        String s2 = "cdab";
        System.out.println("Given Strings: "+s1+"  And: "+s2);
        System.out.println("Given Strings are rotations of Each other: "+areRotations(s1, s2));
        s1="aab";
        s2="aba";
        System.out.println("\nGiven String: "+s1+"  And: "+s2);
        System.out.println("Given Strings are rotations of Each other: "+areRotations(s1, s2));
        s1="abcd";
        s2="acbd";
        System.out.println("\nGiven String: "+s1+"  And: "+s2);
        System.out.println("Given Strings are rotations of Each other: "+areRotations(s1, s2));

    }
}

/*Sample Output:

Given Strings: abcd  And: cdab
Given Strings are rotations of Each other: true

Given String: aab  And: aba
Given Strings are rotations of Each other: true

Given String: abcd  And: acbd
Given Strings are rotations of Each other: false
 */