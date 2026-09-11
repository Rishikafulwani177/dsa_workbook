class Solution {
    public int fun(int i, int j, int m, int n, int[][] grid, int[][] dp){
        if(i<0 || j<0 || i>=m || j>=n){
            return Integer.MAX_VALUE;
        }

        if(i==m-1 && j==n-1){
            return grid[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int c1= fun(i+1, j, m, n, grid, dp);
        int c2= fun(i, j+1, m, n, grid, dp);
        return dp[i][j]= grid[i][j] + Math.min(c1,c2);
    }

    public int minPathSum(int[][] grid) {
        int[][] dp= new int[grid.length][grid[0].length];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return fun(0,0,grid.length,grid[0].length,grid,dp);
    }
}