/*
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.

1 <= length(S) <= 1e6
S can have special characters
 */
package arrays;

public class AmazingSubarrays {

    public static int solve(String A) {
        char[] input = A.toCharArray();
        int n=input.length;
        long count = 0;

        for(int i=0;i<n;i++){
            if (input[i]=='a'||input[i]=='e'||input[i]=='i'||input[i]=='o'||input[i]=='u'||input[i]=='A'||input[i]=='E'||input[i]=='I'||input[i]=='O'||input[i]=='U'){
                count = count + (n-i);
            }
        }
        return (int)(count%10003);
    }

    public static void main(String[] args) {
        String s="ABCGAG";

        System.out.println("Input String: "+ s);
        System.out.println("No of Amazing subarrays: "+solve(s) );

        s="ABEC";
        System.out.println("\nInput String: "+ s);
        System.out.println("No of Amazing subarrays: "+solve(s) );

        s="abecid";
        System.out.println("\nInput String: "+ s);
        System.out.println("No of Amazing subarrays: "+solve(s) );

    }

}

/*Sample Output:

Input String: ABCGAG
No of Amazing subarrays: 8

Input String: ABEC
No of Amazing subarrays: 6

Input String: abecid
No of Amazing subarrays: 12

 */
