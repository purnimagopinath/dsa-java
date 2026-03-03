package Revision_V1.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/flood-fill/description/
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        solve(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void solve(int[][] image, int r, int c, int ogColor, int newColor){
        if(r<0 || c<0) return;
        if(r>=image.length || c>=image[0].length) return;
        if(image[r][c]!=ogColor) return;
        if(image[r][c]==newColor) return;
        image[r][c] = newColor;
        int[][] dirs = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        for(int[] dir:dirs){
            int nr = r+dir[0];
            int nc = c+dir[1];
            solve(image, nr, nc, ogColor, newColor);
        }

    }

    public static void main(String[] args){
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println("\nInput: "+ Arrays.deepToString(image));
        FloodFill obj = new FloodFill();
        System.out.println("After filling: "+Arrays.deepToString(obj.floodFill(image, 1, 1, 2)));
    }
}

/*Sample Output:
Input: [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
After filling: [[2, 2, 2], [2, 2, 0], [2, 0, 1]]
 */