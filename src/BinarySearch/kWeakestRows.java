//Easy
//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/?envType=problem-list-v2&envId=binary-search

package BinarySearch;

import java.util.Arrays;

public class kWeakestRows {
    public static int[] weakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] strength = new int[m][2];

        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int num : mat[i]) {
                if (num == 1) count++;
                else break;
            }
            strength[i][0] = count;
            strength[i][1] = i;
        }

        Arrays.sort(strength, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });


        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = strength[i][1];
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] input1= {{1,1, 0, 0, 0},{1, 1, 1, 1, 0}, {1, 0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k=3;
        System.out.println("\nInput array: "+ Arrays.deepToString(input1));
        System.out.println("The Weakest "+ k +" rows in array is: "+Arrays.toString(weakestRows(input1, k)));

        int[][] input2={{1, 0, 0, 0, 0}, {1, 1, 1, 1},{1, 0, 0, 0},{1, 0, 0, 0}};
        k=2;
        System.out.println("\nInput array: "+Arrays.deepToString(input2));
        System.out.println("The Weakest "+ k +" rows in array is: "+Arrays.toString(weakestRows(input2, k)));

    }
}

/*Sample Output:

Input array: [[1, 1, 0, 0, 0], [1, 1, 1, 1, 0], [1, 0, 0, 0, 0], [1, 1, 0, 0, 0], [1, 1, 1, 1, 1]]
The Weakest 3 rows in array is: [2, 0, 3]

Input array: [[1, 0, 0, 0, 0], [1, 1, 1, 1], [1, 0, 0, 0], [1, 0, 0, 0]]
The Weakest 2 rows in array is: [0, 2]

 */