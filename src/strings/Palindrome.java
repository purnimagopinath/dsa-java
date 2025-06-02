//https://www.geeksforgeeks.org/palindrome-string/


package strings;

public class Palindrome {
    static boolean isPalindrome(String s) {
        // code here
        int n=s.length();
        int left=0, right = n-1;
        while(left<right){
            if(!(s.charAt(left)==s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String s="abba";
        System.out.println("Given String: "+s);
        System.out.println("Is Palindrome: "+isPalindrome(s));
        s="abc";
        System.out.println("\nGiven String: "+s);
        System.out.println("Is Palindrome: "+isPalindrome(s));
        s="a";
        System.out.println("\nGiven String: "+s);
        System.out.println("Is Palindrome: "+isPalindrome(s));
        s="acbca";
        System.out.println("\nGiven String: "+s);
        System.out.println("Is Palindrome: "+isPalindrome(s));
    }
}
/*Sample Output:
Given String: abba
Is Palindrome: true

Given String: abc
Is Palindrome: false

Given String: a
Is Palindrome: true

Given String: acbca
Is Palindrome: true

 */