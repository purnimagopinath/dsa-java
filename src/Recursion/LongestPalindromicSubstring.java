package Recursion;

public class LongestPalindromicSubstring {
    public static void main(String[] args){
        String str = "aaaabbaa";
        System.out.println("\nInput:"+str);
        System.out.println("Max length of palindrome is:"+lengthOfLongest(str, 0, str.length()-1, 0));
        str = "banana";
        System.out.println("\nInput:"+str);
        System.out.println("Max length of palindrome is:"+lengthOfLongest(str, 0, str.length()-1, 0));
    }

    public static int lengthOfLongest(String str, int i, int j, int max){
        if(i==j) return max+1;
        if(i>j) return max;
        if(str.charAt(i)==str.charAt(j)){
            return Math.max(lengthOfLongest(str, i+1, j-1, max+2),
                    Math.max(lengthOfLongest(str, i, j-1, max), lengthOfLongest(str, i+1, j, max)));
        }else{
            return Math.max(lengthOfLongest(str, i, j-1, max), lengthOfLongest(str, i+1, j, max));
        }
    }

    /*Sample Output:

Input:aaaabbaa
Max length of palindrome is:6

Input:banana
Max length of palindrome is:5


     */
}
