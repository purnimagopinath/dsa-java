package Recursion;

//https://www.geeksforgeeks.org/dsa/count-set-bits-of-number-using-recursion/
public class CountingSetBits {
    public int getCount(int n){
        if (n==0) return 0;
        if(n==1) return n;
        return (n%2)+getCount(n/2);
    }
    public static void main(String[] args){
        int input = 21;
        CountingSetBits obj = new CountingSetBits();
        System.out.println("\nInput is:"+input);

        int output = obj.getCount(input);
        System.out.println("Output is: "+output);
        input = 16;
        System.out.println("\nInput is:"+input);

        output = obj.getCount(input);
        System.out.println("Output is: "+output);
    }
}

/*Sample Output:
Input is:21
Output is: 3

Input is:16
Output is: 1

 */