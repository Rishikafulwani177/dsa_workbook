class Solution {
    int[] x= {-1,1,0,0};
    int[] y= {0,0,-1,1};
    int res=0;

    public boolean valid(int i, int j, int m, int n){
        if(i<0 || j<0 || i>=m || j>=n){
            return false;
        }
        return true;
    }

    public int fun(int i, int j, int[][] grid){
        int area=1;
        for(int k=0; k<4; k++){
            int x1= i+x[k];
            int y1= j+y[k];
            if(valid(x1,y1,grid.length, grid[0].length) && grid[x1][y1]==1){
                //area++;
                grid[x1][y1]=-1;
                area += fun(x1, y1, grid);
            }
        }
        //res=Math.max(area,res);
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    grid[i][j]=-1;
                    int area= fun(i,j,grid);
                    res=Math.max(area,res);
                }
            }
        }
        return res;
    }
}