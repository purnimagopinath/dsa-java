//https://www.geeksforgeeks.org/finding-sum-of-digits-of-a-number-until-sum-becomes-single-digit/
//https://www.geeksforgeeks.org/problems/repeated-sum-of-digits3955/1

//Easy
package arrays;

public class RepetitiveSumOfNumber {
    static int repeatedSumOfDigits(int N) {
        int sum = getSum(N);
        while (sum>9) {
            sum = getSum(sum) ;
        }
        return sum ;
    }

    static int getSum (int n) {
        int s = 0 ;
        while ( n>0 ) {
            int rem = n % 10 ;
            s += rem ;
            n = n/10 ;
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 1234;

        System.out.println("Input Number: "+ n);
        System.out.println("Repetitive Sum Of given number : "+repeatedSumOfDigits(n));

        n = 9999;
        System.out.println("Input Number: "+ n);
        System.out.println("Repetitive Sum Of given number : "+repeatedSumOfDigits(n));

        n = 5674;
        System.out.println("Input Number: "+ n);
        System.out.println("Repetitive Sum Of given number : "+repeatedSumOfDigits(n));


    }
}

/* Sample Output:

Input Number: 1234
Repetitive Sum Of given number : 1

Input Number: 9999
Repetitive Sum Of given number : 9

Input Number: 5674
Repetitive Sum Of given number : 4
 */