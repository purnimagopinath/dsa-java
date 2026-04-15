package Revision_V2.Easy;

public class RecursionBasics {
    public static void main(String[] args){
        System.out.println("\n One to n where n is 7");
        printOneToN(7);
        System.out.println("\n N to One where n is 7");
        printNToOne(7);
        System.out.println("\n Factorial of 5 is : "+factorial(5));
    }

    public static void printOneToN(int n){
        if(n==0) return;
        printOneToN(n-1);
        System.out.println(n);
    }

    public static void printNToOne(int n){
        if(n==0) return;
        System.out.println(n);
        printNToOne(n-1);
    }

    public static int factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);

    }
}


/*Sample Output:
One to n where n is 7
1
2
3
4
5
6
7

 N to One where n is 7
7
6
5
4
3
2
1

 Factorial of 5 is : 120
 */