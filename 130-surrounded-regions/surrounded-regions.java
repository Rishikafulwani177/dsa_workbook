class Solution {
    int[] x= {-1,1,0,0};
    int[] y= {0,0,-1,1};

    public boolean valid(int i, int j, int m, int n){
        if(i<0 || j<0 || i>=m || j>=n){
            return false;
        }
        return true;
    }

    public void fun(int i, int j, char[][] board){
        for(int k=0; k<4; k++){
            int x1= i+ x[k];
            int y1= j+ y[k];

            if(valid(x1,y1,board.length,board[0].length) && board[x1][y1]=='O'){
                board[x1][y1]='#';
                fun(x1,y1,board);
            }
        }
    }

    public void solve(char[][] board) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if((i==0 || j==0 || i==board.length-1 || j==board[0].length-1) && board[i][j]=='O'){
                    board[i][j]='#';
                    fun(i,j,board);
                }
            }
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='#'){
                    board[i][j]='O';
                } else {
                    board[i][j]='X';
                }
            }
        }

        return;
    }
}