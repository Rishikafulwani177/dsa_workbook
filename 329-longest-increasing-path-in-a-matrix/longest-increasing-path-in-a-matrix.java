class Solution {
    public boolean valid(int i, int j, int m, int n){
        if(i<0 || j<0 || i>=m || j>=n){
            return false;
        }
        return true;
    }

    public int fun(int i, int j, int[][] arr, int[][] dp){
        int c1=1;
        int c2=1;
        int c3=1;
        int c4=1;
        int m=arr.length;
        int n=arr[0].length;

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(valid(i-1,j,m,n) && arr[i-1][j] > arr[i][j]){
            c1= 1+ fun(i-1,j,arr,dp);
        }

        if(valid(i,j+1,m,n) && arr[i][j+1] > arr[i][j]){
            c2= 1+ fun(i,j+1,arr,dp);
        }

        if(valid(i+1,j,m,n) && arr[i+1][j] > arr[i][j]){
            c3= 1+ fun(i+1,j,arr,dp);
        }

        if(valid(i,j-1,m,n) && arr[i][j-1] > arr[i][j]){
            c4= 1+ fun(i, j-1, arr,dp);
        }

        return dp[i][j]= Math.max(c1,Math.max(c2,Math.max(c3,c4)));
    }

    public int longestIncreasingPath(int[][] matrix) {
        int res=0;
       
        int[][] dp= new int[matrix.length][matrix[0].length];

        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                int ans= fun(i,j,matrix, dp);
                res= Math.max(ans,res);
            }
        }
        return res;
    }
}