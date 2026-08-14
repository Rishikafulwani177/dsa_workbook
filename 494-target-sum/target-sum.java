class Solution {
    public int fun(int i, int s, int target, int[] nums){
        if(i==nums.length){
            if(s==target){
                return 1;
            } else {
                return 0;
            }
        }

        int c1= fun(i+1, s+nums[i], target, nums);
        int c2= fun(i+1, s-nums[i], target, nums);
        return c1+c2;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return fun(0,0, target, nums);
    }
}