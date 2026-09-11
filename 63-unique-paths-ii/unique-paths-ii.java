class Solution {
    public int fun(int i, int j, int m, int n, int[][] grid, int[][] dp){
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }

        if(i==m-1 && j==n-1){
            return 1;
        }

        if(grid[i][j]==1){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int c1= fun(i+1, j, m, n, grid, dp);
        int c2= fun(i, j+1, m, n, grid, dp);
        return dp[i][j]= c1+c2;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        int[][] dp= new int[m+1][n+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return fun(0,0,m,n,obstacleGrid,dp);
    }
}