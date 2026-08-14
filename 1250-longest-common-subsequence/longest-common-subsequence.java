class Solution {
    public int fun(int i, int j, String text1, String text2, int[][] dp){
        if(i==text1.length() || j==text2.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]= 1+ fun(i+1, j+1, text1, text2, dp);
        } 

        int c1= fun(i+1, j, text1, text2, dp);
        int c2= fun(i, j+1, text1, text2, dp);
        return dp[i][j]= Math.max(c1,c2);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp= new int[text1.length()+1][text2.length()+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        int res= fun(0,0, text1, text2, dp);
        return res;
    }
}