class Solution {
    int[] x= {-1,1,0,0};
    int[] y= {0,0,-1,1};
    int res=0;

    public boolean isvalid(int i, int j, int m, int n){
        if(i<0 || i>=m || j<0 || j>=n){
            return false;
        }
        return true;
    }

    public void count(int i, int j, char[][] grid){
        int m= grid.length; 
        int n= grid[0].length;
        for(int k=0; k<4; k++){
            int x1= i+x[k];
            int y1= j+y[k];
            if(isvalid(x1,y1,m,n) && grid[x1][y1]=='1'){
                grid[x1][y1]='0';
                count(x1,y1,grid);
            }
        }
    }

    public int numIslands(char[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    res++;
                    count(i, j, grid);
                }
            }
        }
        return res;
    }
}