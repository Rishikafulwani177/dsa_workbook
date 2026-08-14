class Solution {
    public boolean fun(int i, int s, int sum, int[] nums, Boolean[][] dp){
        if(i==nums.length){
            if(s==sum){
                return true; 
            } else {
                return false;
            }
        }

        if(dp[i][s] != null){
            return dp[i][s];
        }

        if(s>sum){
            return false;
        }
        
        boolean c1= fun(i+1, s+nums[i], sum, nums, dp);
        boolean c2= fun(i+1, s, sum, nums, dp);
        return dp[i][s]= c1 || c2;
    }

    public boolean canPartition(int[] nums) {
        int total=0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
        } 

        if(total%2 !=0){
            return false;
        } 

        int sum= total/2;
        Boolean[][] dp= new Boolean[nums.length+1][total+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], null);
        }
        return fun(0, 0, sum, nums, dp);
    }
}