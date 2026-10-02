class Solution {
    public int maxProduct(int[] nums) {
        int minans=1;
        int maxans=1;
        int res=nums[0];

        for(int i=0; i<nums.length; i++){
            int v1=nums[i];
            int v2=minans*nums[i];
            int v3=maxans*nums[i];

            minans=Math.min(v1,Math.min(v2,v3));
            maxans=Math.max(v1,Math.max(v2,v3));
            res=Math.max(res,Math.max(v1,maxans));
        }

        return res;
    }
}