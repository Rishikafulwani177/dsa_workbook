class Solution {
    public int fun(int i, int j, String w1, String w2, int[][] dp, int m, int n){
        //Base Case
        if(i==w1.length() && j==w2.length()){
            return 0;
        }

        if(i==w1.length()){
            return n-j;
        }

        if(j==w2.length()){
            return m-i;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(w1.charAt(i)==w2.charAt(j)){
            return dp[i][j]= fun(i+1, j+1, w1, w2, dp, m, n);
        }

        int c1= fun(i, j+1, w1, w2, dp, m, n);
        int c2= fun(i+1, j, w1, w2, dp, m, n);
        int c3= fun(i+1, j+1, w1, w2, dp, m, n);
        return dp[i][j]= 1+ Math.min(c1, Math.min(c2,c3));
    }

    public int minDistance(String word1, String word2) {
        int[][] dp= new int[word1.length()][word2.length()];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }

        int m=word1.length();
        int n=word2.length();

        int res= fun(0,0,word1,word2,dp,m,n);
        return res;
    }
}