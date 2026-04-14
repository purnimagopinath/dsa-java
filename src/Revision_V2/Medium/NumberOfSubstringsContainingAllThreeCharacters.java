package Revision_V2.Medium;
//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
public class NumberOfSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        if(n<=1) return n;

        int total = 0;
        int left = 0, right = 0;
        int[] freq = new int[3];

        while(right<n){
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                total+=(n-right);
                freq[s.charAt(left)-'a']--;
                left++;
            }

            right++;
        }

        return total;
    }

    public static void main(String[] args){
        String s = "abcabc";
        NumberOfSubstringsContainingAllThreeCharacters obj  = new NumberOfSubstringsContainingAllThreeCharacters();
        System.out.println("Input is: "+s);
        System.out.println("No of substrings containing all 3 characters is: "+obj.numberOfSubstrings(s));

        s = "aaacb";
        System.out.println("Input is: "+s);
        System.out.println("No of substrings containing all 3 characters is: "+obj.numberOfSubstrings(s));

        s = "abc";
        System.out.println("Input is: "+s);
        System.out.println("No of substrings containing all 3 characters is: "+obj.numberOfSubstrings(s));
    }
}


/*Sample Output:

Input is: abcabc
No of substrings containing all 3 characters is: 10
Input is: aaacb
No of substrings containing all 3 characters is: 3
Input is: abc
No of substrings containing all 3 characters is: 1

 */