package Recursion;

public class GeometricProgression {

    public static double gp(int n){
        if(n==0) return 1;
        return 1/(double)Math.pow(3,n) + gp(n-1);
    }

    public static void main(String[] args){
        int n=5;
        System.out.println("Input: "+n);
        System.out.println("Output is "+gp(n));
        n=7;
        System.out.println("Input: "+n);
        System.out.println("Output is "+gp(n));
    }
}


/*Sample Output:
Input: 5
Output is 1.4979423868312758
Input: 7
Output is 1.4997713763145861
 */