//https://www.geeksforgeeks.org/check-if-two-given-strings-are-isomorphic-to-each-other/

//https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1


package strings;

import java.util.Arrays;

public class IsomorphicStrings {

    public static boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for(int i=0;i < s1.length(); i++){
            freq1[s1.charAt(i)]++;
        }

        for(int i=0;i < s2.length(); i++){
            freq2[s2.charAt(i)]++;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);

    }

    public static void main(String[] args){
        String s1="aab";
        String s2 = "xxy";
        System.out.println("Given Strings: "+s1+"  And: "+s2);
        System.out.println("Given Strings are Isomorphic Strings: "+areIsomorphic(s1, s2));
        s1="aab";
        s2="xyz";
        System.out.println("\nGiven String: "+s1+"  And: "+s2);
        System.out.println("Given Strings are Isomorphic Strings: "+areIsomorphic(s1, s2));
        s1="aac";
        s2="xyz";
        System.out.println("\nGiven String: "+s1+"  And: "+s2);
        System.out.println("Given Strings are Isomorphic Strings: "+areIsomorphic(s1, s2));

    }

    //Fails for dyhnjitfuexuxgauaxekaqc
    //meghoqtclljtuwgladtgfun

    //Used inbuilt functions instead of proper logic !

}


/*Sample Output:
Given Strings: aab  And: xxy
Given Strings are Isomorphic Strings: true

Given String: aab  And: xyz
Given Strings are Isomorphic Strings: false

Given String: aac  And: xyz
Given Strings are Isomorphic Strings: false
 */
