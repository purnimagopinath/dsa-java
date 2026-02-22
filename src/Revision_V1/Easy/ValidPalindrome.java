package Revision_V1.Easy;
//Strings

//https://leetcode.com/problems/valid-palindrome/


public class ValidPalindrome {
    public boolean isPalindrome(String s){
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(left < right){

            // skip non-alphanumeric from left
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;

            // skip non-alphanumeric from right
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            if(l != r) return false;

            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args){
        String[] input = {"A man, a plan, a canal: Panama", "race a car", " "};
        ValidPalindrome obj = new ValidPalindrome();

        for(String s:input){
            System.out.println("\nInput is: "+s);
            System.out.println("String is valid palindrome :"+obj.isPalindrome(s));
        }
    }
}


/*Sample Output:
Input is: A man, a plan, a canal: Panama
String is valid palindrome :true

Input is: race a car
String is valid palindrome :false

Input is:
String is valid palindrome :true

 */