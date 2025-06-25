//https://www.geeksforgeeks.org/find-the-minimum-distance-between-the-given-two-words/

//https://www.geeksforgeeks.org/problems/closest-strings0611/1
package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumDistanceBetweenWords {
    static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int word1Distance = -1, word2Distance = -1;
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1))
                word1Distance = i;
            if (s.get(i).equals(word2))
                word2Distance = i;
            if (word1Distance != -1 && word2Distance != -1)
                distance = Math.min(distance, Math.abs(word1Distance - word2Distance));
        }

        // Return the answer
        return distance;
    }

    public static void main(String[] args){
        String s1="the";
        String s2 = "fox";
        ArrayList<String> s = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox", "quick"));
        System.out.println("Given Strings: "+s1+"  And: "+s2);
        System.out.println("Minimum Distance Between Given Words: "+shortestDistance(s, s1, s2));
        s = new ArrayList<>(Arrays.asList("geeks", "for", "geeks", "contribute", "practice"));
        s1="geeks";
        s2="practice";
        System.out.println("\nGiven String: "+s1+"  And: "+s2);
        System.out.println("Minimum Distance Between Given Words: "+shortestDistance(s, s1, s2));

    }


}

/*Sample Output:
Given Strings: the  And: fox
Minimum Distance Between Given Words: 3

Given String: geeks  And: practice
Minimum Distance Between Given Words: 2

 */