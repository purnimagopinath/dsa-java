/*

You are given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.

First and only argument is a string A.
Return an long integer denoting the answer.
 */
package arrays;


public class SpecialSubSequenceAG {
    public static long solve(String A) {
        char[] arr = A.toCharArray();

        int n = arr.length;
        //finding occurences of G in reverse first
        int[] countingGs = new int[n];
        countingGs[n-1] = ((arr[n-1]=='G')? 1:0);

        for(int i=n-2; i>=0; i--){
            if(arr[i]=='G'){
                countingGs[i] = countingGs[i+1]+1;
            }else{
                countingGs[i] = countingGs[i+1] ;
            }
        }

        long ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='A'){
                ans = ans+countingGs[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="ABCGAG";

        System.out.println("Input String: "+ s);
        System.out.println("No of times Subsequence AG Occurs: "+solve(s) );

        s="GAB";
        System.out.println("\nInput String: "+ s);
        System.out.println("No of times Subsequence AG Occurs: "+solve(s) );

    }
}


/*Sample Output:
Input String: ABCGAG
No of times Subsequence AG Occurs: 3

Input String: GAB
No of times Subsequence AG Occurs: 0
 */