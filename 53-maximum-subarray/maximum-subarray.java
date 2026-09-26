class Solution {
    public int maxSubArray(int[] nums) {
        int bestans=0;
        int res=nums[0];

        for(int i=0; i<nums.length; i++){
            int v1=nums[i];
            int v2=bestans+nums[i];
            bestans=Math.max(v1,v2);
            res=Math.max(res,bestans);
        }

        return res;
    }
}