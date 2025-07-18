//https://leetcode.com/problems/decode-string/description/?envType=problem-list-v2&envId=recursion

//394

//Medium

package Recursion;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(curr.toString());
                num = 0;
                curr = new StringBuilder();
            } else if (c == ']') {
                int repeat = numStack.pop();
                StringBuilder prev = new StringBuilder(strStack.pop());
                for (int i = 0; i < repeat; i++) {
                    prev.append(curr);
                }
                curr = prev;
            } else {
                curr.append(c);
            }
        }

        return curr.toString();

    }

    public static void main(String[] args){
        String s= "3[a]2[bc]";
        System.out.println("\nGiven String: "+s);
        System.out.println("Decoded String is: "+decodeString(s));
        s="3[a2[c]]";
        System.out.println("\nGiven String: "+s);
        System.out.println("Decoded String is: "+decodeString(s));
        s="2[abc]3[cd]ef";
        System.out.println("\nGiven String: "+s);
        System.out.println("Decoded String is: "+decodeString(s));

    }
}
/*Sample Output:
Given String: 3[a]2[bc]
Decoded String is: aaabcbc

Given String: 3[a2[c]]
Decoded String is: accaccacc

Given String: 2[abc]3[cd]ef
Decoded String is: abcabccdcdcdef

 */