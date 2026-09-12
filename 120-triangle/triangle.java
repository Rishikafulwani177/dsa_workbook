class Solution {
    public int fun(int i, List<List<Integer>> tri, int level, int[][] dp){
        if(level==tri.size()){
            return 0;
        }

        if(dp[i][level] != Integer.MAX_VALUE){
            return dp[i][level];
        }

        int c1= tri.get(level).get(i) + fun(i,tri,level+1,dp);
        int c2= tri.get(level).get(i+1) + fun(i+1, tri, level+1,dp);
        return dp[i][level]= Math.min(c1,c2);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        return triangle.get(0).get(0) + fun(0, triangle, 1, dp);
    }
}