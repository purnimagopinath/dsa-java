package Recursion;

public class ReverseFibonacci {
    public void generateFib(int[] fib,  int n){
       if(n==0){
           fib[0]=0;
       }else if(n==1){
           fib[1]=1;
       }else{
           generateFib(fib ,n-1);
           fib[n] = fib[n-1]+fib[n-2];
       }

    }

    public void printReverse(int[] arr, int idx){
        if(idx<0) return ;
        System.out.print(arr[idx]+" ");
        printReverse(arr, idx-1);
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println("\nInput: "+n);
        ReverseFibonacci obj = new ReverseFibonacci();
        int[] fib = new int[n];
        obj.generateFib(fib, n-1);
        obj.printReverse(fib, n-1);
        n=10;
        System.out.println("\n\nInput: "+n);
        int[] fib1 = new int[n];
        obj.generateFib(fib1, n-1);
        obj.printReverse(fib1, n-1);

    }
}


/*Sample Output:
Input: 5
3 2 1 1 0

Input: 10
34 21 13 8 5 3 2 1 1 0

 */