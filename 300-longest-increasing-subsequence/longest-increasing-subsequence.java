class Solution {
    public int fun(int i, int[] nums, int lastidx, int[][] dp){
        if(i==nums.length){
            return 0;
        }

        if(dp[i][lastidx+1] != -1){
            return dp[i][lastidx+1];
        }

        if(lastidx==-1 ||  nums[i]>nums[lastidx]){
            int p = 1 + fun(i+1, nums, i, dp);
            int np= fun(i+1, nums, lastidx, dp);
            return dp[i][lastidx+1]=  Math.max(p,np);
        }

        return dp[i][lastidx+1]= fun(i+1, nums, lastidx,dp);
    }

    public int lengthOfLIS(int[] nums) {
        int[][] dp= new int[nums.length+1][nums.length+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }

        return fun(0,nums,-1, dp);
    }
}