//https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/?envType=problem-list-v2&envId=recursion

//Easy

//3304


package Recursion;

public class KthCharInStringGame1 {

    /*
    StringBuilder sb=new StringBuilder("a");
        while(sb.length()<k){
            int l=sb.length();
            for(int i=0;i<l;i++){
                sb.append((char)('a'+((sb.charAt(i)-'a')+1)%26));//%26 is use for z to a 26%26 next char a

            }
        }
        return sb.charAt(k-1);
     */
    public static char kthCharacter(int k) {

        int level = 0;
        while ((1 << level) < k) {
            level++;
        }
        return helper(k, level);
    }

    static char helper(int k, int level) {
        if (level == 0) {
            return 'a';
        }
        int half = 1 << (level - 1);
        if (k <= half) {
            return helper(k, level - 1);
        } else {
            char c = helper(k - half, level - 1);
            return (c == 'z') ? 'a' : (char)(c + 1);
        }
    }

    public static void main(String[] args){
        int s = 5;
        System.out.println("Given K : "+s);
        System.out.println("Kth Character in the String is: "+kthCharacter(s));
        s = 10 ;
        System.out.println("\nGiven K: "+s);
        System.out.println("Kth Character in the String is: "+kthCharacter(s));

    }
}

/*Sample Output:

Given K : 5
Kth Character in the String is: b

Given K: 10
Kth Character in the String is: c

 */