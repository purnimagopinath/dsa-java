//https://www.geeksforgeeks.org/reverse-words-in-a-given-string/

//https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1

package strings;

public class ReverseStringDots {
    public  static String reverseWords(String s) {

        s = s.trim();

        // Replace multiple spaces with a single space
        s = s.replaceAll("\\s+", " ");

        // Split the string into words
        String[] words = s.split(" ");

        // StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        // Remove the trailing space and return the result
        return reversed.toString().trim();

    }

    public static void main(String[] args){
        String s=" i like this program very much ";
        System.out.println("Given String: "+s);
        System.out.println("Reversed String is: "+reverseWords(s));
        s=" pqr mno ";
        System.out.println("\nGiven String: "+s);
        System.out.println("Reversed String is: "+reverseWords(s));
        s="  a  ";
        System.out.println("\nGiven String: "+s);
        System.out.println("Reversed String is: "+reverseWords(s));
        s="abdcfe";
        System.out.println("\nGiven String: "+s);
        System.out.println("Reversed String is: "+reverseWords(s));

    }
}

/*Sample Output:

Given String:  i like this program very much
Reversed String is: much very program this like i

Given String:  pqr mno
Reversed String is: mno pqr

Given String:   a
Reversed String is: a

Given String: abdcfe
Reversed String is: abdcfe

 */