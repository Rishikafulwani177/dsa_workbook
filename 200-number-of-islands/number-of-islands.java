class Solution {
    int[] x= {-1,1,0,0};
    int[] y= {0,0,-1,1};

    public boolean valid(int i, int j, int n, int m){
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        return true;
    }

    public void dfs(int i, int j, char[][] grid, int[][] visit){
        int n=grid.length;
        int m=grid[0].length;

        visit[i][j]=1;  //visit array

        for(int k=0; k<4; k++){
            int row= i+x[k];    //i and j and n and m 
            int col= j+y[k];
            if(valid(row,col,n,m) && visit[row][col]==0 && grid[row][col]=='1'){
                dfs(row,col,grid,visit);
            }
        }

        return;
    }
 
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m= grid[0].length;
        int[][] visit= new int[n][m];
        int res=0;

        int i,j;

        for( i=0; i<n ;i++){
            for( j=0; j<m; j++){
                if(visit[i][j]==0 && grid[i][j]=='1'){
                    dfs(i, j, grid, visit);
                    res++;
                }
            }
        }

        return res;
    }
}