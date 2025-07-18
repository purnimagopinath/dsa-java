//https://leetcode.com/problems/k-th-symbol-in-grammar/description/?envType=problem-list-v2&envId=recursion

//779

//Medium

package Recursion;

public class KthSymbolInGrammar {
    public static int kthGrammar(int n, int k) {
        if(k==1){
            return 0;
        }
        if(k==2){
            return 1;
        }
        int mid = ((int)Math.pow(2,n-1))/2;
        if(k<=mid){
            return kthGrammar(n-1, k);
        }else{
            return 1-kthGrammar(n-1, k-mid);
        }
    }

    public static void main(String[] args){
        int n=2, k=1;
        System.out.println("\nTotal rows and target row is: "+n);
        System.out.println("K is : "+k+".  Kth bit in nth row is :"+kthGrammar(n,k));
        n=2; k=1;
        System.out.println("\nTotal rows and target row is: "+n);
        System.out.println("K is : "+k+".  Kth bit in nth row is :"+kthGrammar(n,k));
        n=2; k=2;
        System.out.println("\nTotal rows and target row is: "+n);
        System.out.println("K is : "+k+".  Kth bit in nth row is :"+kthGrammar(n,k));

        n=5; k=8;
        System.out.println("\nTotal rows and target row is: "+n);
        System.out.println("K is : "+k+".  Kth bit in nth row is :"+kthGrammar(n,k));
    }
}

/*Sample Output:
Total rows and target row is: 2
K is : 1.  Kth bit in nth row is :0

Total rows and target row is: 2
K is : 1.  Kth bit in nth row is :0

Total rows and target row is: 2
K is : 2.  Kth bit in nth row is :1

Total rows and target row is: 5
K is : 8.  Kth bit in nth row is :1

 */