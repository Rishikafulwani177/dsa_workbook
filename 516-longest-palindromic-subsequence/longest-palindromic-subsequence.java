class Solution {
    public int fun(int i, int j, String s, int[][] dp){
        if(i==j){
            return 1;
        }

        if(i>j){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]= 2 + fun(i+1, j-1, s, dp);
        }

        int c1= fun(i+1, j, s, dp);
        int c2= fun(i, j-1, s, dp);
        return dp[i][j]= Math.max(c1, c2);
    }

    public int longestPalindromeSubseq(String s) {
        int[][] dp= new int[s.length()][s.length()];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        int res= fun(0, s.length()-1, s, dp);
        return res;
    }
}