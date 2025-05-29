/*

Given an integer A,
generate a square matrix filled with elements from 1 to A^2 in spiral order and
return the generated square matrix.
Return a 2-D matrix which consists of the elements added in spiral order.

 */
package arrays;

import java.util.Arrays;

public class SpiralOrderMatrix2 {
    public static int[][] generateMatrix(int A) {
        int count = 1;
        int[][] ans = new int[A][A];
        int r = 0, c= 0;
        while(A > 1){
            for(int i = 1; i < A; i++){
                ans[r][c] = count;
                c++;
                count++;
            }
            for(int i = 1; i < A; i++){
                ans[r][c] = count;
                r++;
                count++;
            }
            for(int i = 1; i < A; i++){
                ans[r][c] = count;
                c--;
                count++;
            }
            for(int i = 1; i < A; i++){
                ans[r][c] = count;
                r--;
                count++;
            }
            r += 1;
            c += 1;
            A -= 2;
        }

        if(A == 1){
            ans[r][c] = count;
        }
        return ans;
    }
    public static void main(String[] args){
        int n=1;
        System.out.println("Input Number: "+ n);
        System.out.println("Generating Sprial Order Matrix: ");
        print2D(generateMatrix(n));

        n=3;
        System.out.println("\nInput Number: "+ n);
        System.out.println("Generating Sprial Order Matrix:");
        print2D(generateMatrix(n));
        n=5;
        System.out.println("\nInput Number: "+ n);
        System.out.println("Generating Sprial Order Matrix: ");
        print2D(generateMatrix(n));

    }
    public static void print2D(int[][] mat)
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}
/*Sample Output:

Input Number: 1
Generating Sprial Order Matrix:
[1]

Input Number: 3
Generating Sprial Order Matrix:
[1, 2, 3]
[8, 9, 4]
[7, 6, 5]

Input Number: 5
Generating Sprial Order Matrix:
[1, 2, 3, 4, 5]
[16, 17, 18, 19, 6]
[15, 24, 25, 20, 7]
[14, 23, 22, 21, 8]
[13, 12, 11, 10, 9]
 */