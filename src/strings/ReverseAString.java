//https://www.geeksforgeeks.org/reverse-a-string/
//https://www.geeksforgeeks.org/problems/reverse-a-string/1
package strings;

public class ReverseAString {
    public static String reverseString(String s) {
        // code here
        int n=s.length();
        String newString="";
        for(int i=n-1;i>=0;i--){
            newString = newString+s.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args){
        String s="Geeks";
        System.out.println("Given String: "+s);
        System.out.println("Reversed String is: "+reverseString(s));
        s="for";
        System.out.println("\nGiven String: "+s);
        System.out.println("Reversed String is: "+reverseString(s));
        s="a";
        System.out.println("\nGiven String: "+s);
        System.out.println("Reversed String is: "+reverseString(s));
        s="abdcfe";
        System.out.println("\nGiven String: "+s);
        System.out.println("Reversed String is: "+reverseString(s));

    }



}

/*Sample Output:

Given String: Geeks
Reversed String is: skeeG

Given String: for
Reversed String is: rof

Given String: a
Reversed String is: a

Given String: abdcfe
Reversed String is: efcdba

 */