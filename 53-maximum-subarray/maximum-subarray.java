class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int bestend= 0;
        for(int i=0; i<nums.length; i++){
            int v1= nums[i];
            int v2= bestend + nums[i];
            bestend= Math.max(v1,v2);
            res=Math.max(bestend, res);
        }
        return res;
    }
}