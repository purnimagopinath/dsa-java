//https://www.geeksforgeeks.org/find-equal-point-string-brackets/

//https://www.geeksforgeeks.org/problems/find-equal-point-in-string-of-brackets2542/1

package strings;

public class EqualPoints {
    public static long countSub(String str) {
        int n=str.length();
        int[] opening = new int[n];
        int[] closing = new int[n];
        int lcount = 0, rcount=0;

        for (int i=0; i<n; i++) {
            if (str.charAt(i) == '(') {
                lcount++;
            }
            opening[i] = lcount;
        }

        for (int i=n-1; i>= 0; i--) {
            if (str.charAt(i) == ')') {
                rcount++;
            }
            closing[i] = rcount;
        }


        for(int i=0;i<n;i++){
            if(opening[i]==closing[i]){
                return i;
            }
        }
        return -1;
        // Your code goes here
    }

    public static void main(String[] args){
        String s="(())))(";
        System.out.println("Given String: "+s);
        System.out.println("Equal point found at: "+countSub(s));
        s="))";
        System.out.println("\nGiven String: "+s);
        System.out.println("Equal point found at: "+countSub(s));
    }
    // Fails for input ")(()))(()))()((())(())))))()())))((((()))()(()((()((()(" .
    //expected ans =28

    //Also for Given String: )) , there  is no (, but they expect 2?

}

/*Sample Output:
Given String: (())))(
Equal point found at: 4

Given String: ))

Equal point found at: -1
 */