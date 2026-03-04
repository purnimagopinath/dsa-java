package Revision_V1.Medium;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-image/description/
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }

    public static void main(String[] args){
        RotateImage obj = new RotateImage();
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("\nInput is :"+ Arrays.deepToString(m1));
        obj.rotate(m1);
        System.out.println("AfterRotating :"+Arrays.deepToString(m1));

        System.out.println("\nInput is :"+ Arrays.deepToString(m2));
        obj.rotate(m2);
        System.out.println("AfterRotating :"+Arrays.deepToString(m2));
    }
}


/*Sample Output:

Input is :[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
AfterRotating :[[7, 4, 1], [8, 5, 2], [9, 6, 3]]

Input is :[[5, 1, 9, 11], [2, 4, 8, 10], [13, 3, 6, 7], [15, 14, 12, 16]]
AfterRotating :[[15, 13, 2, 5], [14, 3, 4, 1], [12, 6, 8, 9], [16, 7, 10, 11]]

 */