class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //sum of array
        int sum= 0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        //min sum subarray
        int bestending=nums[0];
        int minsum= nums[0];
        for(int i=1; i<nums.length; i++){
            int v1=nums[i];
            int v2=bestending+nums[i];

            bestending=Math.min(v1,v2);
            minsum=Math.min(bestending,minsum);
        }

        int res= sum-minsum;

       

        int maxending=nums[0];
        int maxsum=nums[0];
        for(int i=1; i<nums.length; i++){
            int v1=nums[i];
            int v2=nums[i]+maxending;
            maxending=Math.max(v1,v2);
            maxsum=Math.max(maxsum,maxending);
        }

        if(res==0){
            return maxsum;
        }

        int ans= Math.max(res,maxsum);
        return ans;
    }
}