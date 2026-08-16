class Solution {
    public int fun(int i, int j, String s1, String s2, int[][] dp){
        if(i==s1.length() || j== s2.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1+ fun(i+1, j+1, s1, s2, dp);
        }

        int c1= fun(i+1, j, s1, s2, dp);
        int c2= fun(i, j+1, s1, s2, dp);
        return dp[i][j] =Math.max(c1,c2);
    }

    public int longestPalindromeSubseq(String s) {
        String s2= new StringBuilder(s).reverse().toString();
        int[][] dp= new int[s.length()+1][s2.length()+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        int res= fun(0,0,s,s2,dp);
        return res;
    }
}