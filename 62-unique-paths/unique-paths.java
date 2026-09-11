class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp= new int[m+1][n+1];
        // Last row = 1
        // From any cell in the last row,
        // there is only one way to reach the destination:
        // move right.
        for (int j = 0; j < n; j++) {
            dp[m - 1][j] = 1;
        }

        // Last column = 1
        // From any cell in the last column,
        // there is only one way to reach the destination:
        // move down.
        for (int i = 0; i < m; i++) {
            dp[i][n - 1] = 1;
        }

        for(int i=m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                int c1=dp[i+1][j];
                int c2=dp[i][j+1];
                dp[i][j]=c1+c2;
            }
        }

        return dp[0][0];
    }
}