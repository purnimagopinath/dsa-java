//https://leetcode.com/problems/special-binary-string/description/?envType=problem-list-v2&envId=recursion

//761

//Hard

package Recursion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpecialBinaryString {
    public static  String makeLargestSpecial(String s){
        List<String> substrings = new ArrayList<>();
        int count = 0;
        int start = 0;
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)=='1')
                count++;
            else count--;
            if(count==0){
                String inner = s.substring(start+1, i);
                String special = "1"+makeLargestSpecial(inner)+"0";
                substrings.add(special);
                start = i+1;
            }
        }

        substrings.sort(Collections.reverseOrder());
        StringBuilder res = new StringBuilder();
        for(String str: substrings){
            res.append(str);
        }
        return res.toString();
    }

    public static void main(String[] args){
        String s="11011000";
        System.out.println("\nGiven string : "+s);
        System.out.println("lexicographically largest resulting string possible after applying the mentioned operations on the string :"+makeLargestSpecial(s));

        s="10";
        System.out.println("\nGiven string : "+s);
        System.out.println("lexicographically largest resulting string possible after applying the mentioned operations on the string :"+makeLargestSpecial(s));
    }
}

/*Sample Output:

Given string : 11011000
lexicographically largest resulting string possible after applying the mentioned operations on the string :11100100

Given string : 10
lexicographically largest resulting string possible after applying the mentioned operations on the string :10

 */
