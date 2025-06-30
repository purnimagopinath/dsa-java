//https://www.geeksforgeeks.org/pangram-checking/

//https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1

package strings;

import java.util.Arrays;

public class PanagramCheck {
    public static boolean checkPangram(String s) {
        // your code here
        int n=s.length();
        int[] alphabetFreq = new int[26];
        for(int i=0;i<n;i++){
            char c=Character.toLowerCase(s.charAt(i));
            if (c>='a' && c <='z'){
                alphabetFreq[c-'a']++;
            }
        }
        Arrays.sort(alphabetFreq);
        return alphabetFreq[0] != 0;
    }
    public static void main(String[] args){
        String s="Bawds jog, flick quartz, vex nymph";
        System.out.println("Given String: "+s);
        System.out.println("Is Panagram: "+checkPangram(s));
        s="sdfs";
        System.out.println("\nGiven String: "+s);
        System.out.println("Is Panagram: "+checkPangram(s));
        s="The quick brown fox jumps over the lazy dog";
        System.out.println("\nGiven String: "+s);
        System.out.println("Is Panagram: "+checkPangram(s));
        s="The quick brown fox jumps over the dog";
        System.out.println("\nGiven String: "+s);
        System.out.println("Is Panagram: "+checkPangram(s));
    }
}

/*Sample Output:

Given String: Bawds jog, flick quartz, vex nymph
Is Panagram: true

Given String: sdfs
Is Panagram: false

Given String: The quick brown fox jumps over the lazy dog
Is Panagram: true

Given String: The quick brown fox jumps over the dog
Is Panagram: false

 */