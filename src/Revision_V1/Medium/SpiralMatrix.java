package Revision_V1.Medium;
//https://leetcode.com/problems/spiral-matrix/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. left → right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // 2. top → bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // 3. right → left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Input : "+ Arrays.deepToString(matrix));
        SpiralMatrix obj = new SpiralMatrix();
        System.out.println("Output is: "+obj.spiralOrder(matrix));

        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println("Input : "+ Arrays.deepToString(matrix1));

        System.out.println("Output is: "+obj.spiralOrder(matrix1));
    }

}

/*Sample Output:

Input : [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output is: [1, 2, 3, 6, 9, 8, 7, 4, 5]
Input : [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
Output is: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
 */