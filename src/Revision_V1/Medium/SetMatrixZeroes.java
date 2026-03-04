package Revision_V1.Medium;

import java.util.Arrays;

//https://leetcode.com/problems/set-matrix-zeroes/description/
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Step 1: Mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: Set zeroes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args){
        SetMatrixZeroes obj = new SetMatrixZeroes();
        int[][] m1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] m2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println("\nInput is :"+ Arrays.deepToString(m1));
        obj.setZeroes(m1);
        System.out.println("After Setting :"+Arrays.deepToString(m1));

        System.out.println("\nInput is :"+ Arrays.deepToString(m2));
        obj.setZeroes(m2);
        System.out.println("After Setting :"+Arrays.deepToString(m2));
    }
}


/*Sample Output:
Input is :[[1, 1, 1], [1, 0, 1], [1, 1, 1]]
After Setting :[[1, 0, 1], [0, 0, 0], [1, 0, 1]]

Input is :[[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]]
After Setting :[[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]

 */