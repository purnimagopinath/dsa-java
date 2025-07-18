//https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/?envType=problem-list-v2&envId=recursion

//1545

//Medium
package Recursion;

public class FindKthBitNthBinaryString {

    public static char findKthBit(int n, int k) {
        if (n == 1) return '0';
        int len = (int)(Math.pow(2,n))-1;
        if(k<((len/2)+1)){
            return findKthBit(n-1,k);
        }
        if(k==((len/2)+1)){
            return '1';
        }else {
            int mirrored = len - k + 1;
            char c = findKthBit(n - 1, mirrored);
            return (c == '0') ? '1' : '0';
        }

    }

    public static void main(String[] args){
        int n=3 ;
        int k=1;
        System.out.println("\nGiven String length : "+n+"  K value: "+k);
        System.out.println("Kth bit will be :"+findKthBit(n,k));
        n=4;
        k=11;
        System.out.println("\nGiven String length : "+n+"  K value: "+k);
        System.out.println("Kth bit will be :"+findKthBit(n,k));
    }
}

/*Sample Output:

Given String length : 3  K value: 1
Kth bit will be :0
//S3 is "0111001"

Given String length : 4  K value: 11
Kth bit will be :1

//S4 is "011100110110001".
 */
