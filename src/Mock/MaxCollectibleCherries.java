package Mock;
/*Problem Statement
You are given an n x n grid.

Each cell contains:
1  -> cherry
0  -> empty
-1 -> thorn/block

You start at (0,0)

You must reach (n-1,n-1)

Moving only right,down

Then turn back using left and up

Return the maximum cherries collectible.

A cherry can only be picked once.

If it’s possible the return(0)
 */

/*Assumptions:
    -1 is a block. so if [0,0] or [n-1][n-1] has -1, answer is 0 as we cannot move anywhere
    we have to go through the grid from 0,0 to n-1 n-1 by right and down
    we have to then go back from n-1 n-1 by left and up
    we can use dp here where:
        state = dp[i][j] = number of cherries collectible till row i and col j
        transition => if grid[i][j] is 1, then dp becomes 1+dp[i-1][j-1]
                      if grid[i][j] is 0, we take max of either the up or down
                      if grid[i][j] is -1, dp[i][j] becomes 0
    But we do have to go through the grid twice, so we have to factor in the choice where we also skip the block




 */
public class MaxCollectibleCherries {
    public int maxCollectibleCherries(int[][] grid){
        int n = grid.length;
        if(n==0) return 0;
        if(grid[0][0]==-1 || grid[n-1][n-1]==-1) return 0;
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    dp[i][j] = 0;
                    continue;
                }
                int cell = grid[i-1][j-1];
                if(cell == -1){
                    dp[i][j] = 0;
                }else if(cell==0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }else{
                    dp[i][j] = 1+dp[i-1][j]+dp[i][j-1];
                    grid[i-1][j-1] = 0;
                }
            }
        }

       return dp[n][n];

    }

    public static void main(String[] args){
        int[][] grid = {{1, 0},{-1, 0}};
        /*
        1 0
        -1 0
        -> 1 cherry
         */

        /*
        1 0 1
        1 -1 0
        0 1 0

        4
         */
        MaxCollectibleCherries obj = new MaxCollectibleCherries();
        System.out.println("Max collectible: "+obj.maxCollectibleCherries(grid));
        int[][] grid1 = {{1,0,1},{1,-1,0},{0,1,0}};
        System.out.println("Max collectible: "+obj.maxCollectibleCherries(grid1));
    }
}
