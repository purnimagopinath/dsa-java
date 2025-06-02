//https://www.geeksforgeeks.org/longest-common-prefix-using-sorting/


package strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] arr){
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(), last.length());
        int i = 0;
        while (i < minLength &&
                first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args){
        String[] sArr=new String[]{"geeksforgeeks", "geeks",  "geek", "geezer"};
        System.out.println("Given String Array: "+Arrays.toString(sArr));
        System.out.println("Most Common Prefix is : "+longestCommonPrefix(sArr));
        sArr=new String[]{"apple", "ape", "april"};
        System.out.println("\nGiven String Array: "+Arrays.toString(sArr));
        System.out.println("Most Common Prefix is : "+longestCommonPrefix(sArr));
        sArr=new String[]{"hello", "world"};
        System.out.println("\nGiven String Array: "+Arrays.toString(sArr));
        System.out.println("Most Common Prefix is : "+longestCommonPrefix(sArr));

    }
}

/*Sample Output:

Given String Array: [geeksforgeeks, geeks, geek, geezer]
Most Common Prefix is : gee

Given String Array: [apple, ape, april]
Most Common Prefix is : ap

Given String Array: [hello, world]
Most Common Prefix is :
 */