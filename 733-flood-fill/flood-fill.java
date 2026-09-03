class Solution {
    int[] x= {-1,1,0,0};
    int[] y= {0,0,-1,1};

    public boolean isvalid(int i, int j, int m, int n){
        if(i<0 || j<0 || i>=m || j>=n){
            return false;
        }
        return true;
    }

    public void color(int i, int j, int color, int[][] image, int[][] hash, int og){
        int m= image.length;
        int n= image[0].length;
        for(int k=0; k<4; k++){
            int x1= i+x[k];
            int y1= j+y[k];
            if(isvalid(x1,y1,m,n) && hash[x1][y1] != 1 && image[x1][y1]==og){
                image[x1][y1]= color;
                hash[x1][y1]=1;
                color(x1,y1,color,image,hash,og);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] hash= new int[image.length][image[0].length];
        int og= image[sr][sc];
        image[sr][sc]= color;
        hash[sr][sc]=1;
        color(sr,sc,color,image, hash, og);
        return image;
    }
}