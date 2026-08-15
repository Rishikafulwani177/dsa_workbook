class Solution {
    public int fun(int i, int j, String word1, String word2, int[][] dp){
        if(i==-1){
            return j+1;
        } 

        if(j==-1){
            return i+1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j]= fun(i-1,j-1, word1, word2, dp);
        }

        int c1= fun(i, j-1, word1, word2, dp);   //insert
        int c2= fun(i-1, j, word1, word2, dp);   //delelte
        int c3= fun(i-1, j-1, word1, word2, dp);   //replace
        return dp[i][j]= 1+ Math.min(c1,Math.min(c2,c3));
    }

    public int minDistance(String word1, String word2) {
        int[][] dp= new int[word1.length()+1][word2.length()+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        int res= fun(word1.length()-1, word2.length()-1, word1, word2, dp);
        return res;
    }
}