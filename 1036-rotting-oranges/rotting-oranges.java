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

    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer,Integer>> q= new LinkedList<>();
        int fresh=0;
        int res=0; 
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    q.offer(new Pair<>(i,j));
                } else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        while(!q.isEmpty() && fresh>0){
            res++;
            int s= q.size();
            while(s-->0){
                Pair<Integer,Integer> pair= q.poll();
                for(int k=0; k<4; k++){
                    int x1= pair.getKey() + x[k];
                    int y1= pair.getValue() +y[k];
                    if(valid(x1,y1,grid.length, grid[0].length) && grid[x1][y1]==1){
                        grid[x1][y1]=2;
                        fresh--;
                        q.offer(new Pair<>(x1,y1));
                    }
                }
            }
        }

        if(fresh!=0){
            return -1;
        }
        return res;
    }
}