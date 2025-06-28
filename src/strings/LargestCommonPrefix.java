//https://www.geeksforgeeks.org/longest-common-prefix-using-sorting/


package strings;

import java.util.Arrays;

public class LargestCommonPrefix {

    static String solve(String[] arr){
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        String commonStr="";
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                commonStr+=first.charAt(i);
            }else{
                break;
            }
        }
        return commonStr;
    }
    public static void main(String[] args) {
        String[] input1 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] input2 = {"apple", "ape", "april"};
        String[] input3 = {"hello", "world"};

        System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("Longest Common Prefix is: "+solve(input1));

        System.out.println("\nInput array: "+Arrays.toString(input2));
        System.out.println("Longest Common Prefix is: "+solve(input2));

        System.out.println("\nInput array: "+Arrays.toString(input3));
        System.out.println("Longest Common Prefix is: "+solve(input3));

    }
}


/*Sample Output:

Input array: [geeksforgeeks, geeks, geek, geezer]
Longest Common Prefix is: gee

Input array: [apple, ape, april]
Longest Common Prefix is: ap

Input array: [hello, world]
Longest Common Prefix is:
 */