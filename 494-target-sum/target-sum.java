class Solution {
    public int fun(int i, int s, int target, int[] nums, HashMap<String,Integer> dp){
        if(i==nums.length){
            if(s==target){
                return 1;
            } else {
                return 0;
            }
        }

        String key= i+","+s;

        if(dp.containsKey(key)){
            return dp.get(key);
        }

        int c1= fun(i+1, s+nums[i], target, nums, dp);
        int c2= fun(i+1, s-nums[i], target, nums, dp);
        dp.put((key), c1+c2);
        return c1+c2;
    }

    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> dp= new HashMap<>();
        return fun(0,0, target, nums, dp);
    }
}