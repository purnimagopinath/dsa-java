package Recursion;

public class CalculateNcR {

    public static void main(String[] args){
        int n=5, r=2;
        System.out.println("Given n: "+n+" r: "+r);
        System.out.println("ncr value : "+ncr(n,r));
        n=3; r=1;
        System.out.println("Given n: "+n+" r: "+r);
        System.out.println("ncr value : "+ncr(n,r));
        n=6; r=3;
        System.out.println("Given n: "+n+" r: "+r);
        System.out.println("ncr value : "+ncr(n,r));

    }

    public static int ncr(int n, int r){
        if(r==0||r==n) return 1;
        if(r==1) return n;
        return (n*ncr(n-1, r-1))/r;
    }
}

/*Sample Output:
Given n: 5 r: 2
ncr value : 10
Given n: 3 r: 1
ncr value : 3
Given n: 6 r: 3
ncr value : 20

 */
