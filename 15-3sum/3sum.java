class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> list= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int sum= -1*nums[i];
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                int s=nums[low]+nums[high];
                if(s==sum){
                    list.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    high--;
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                } else if(s<sum) {
                    low++;
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                } else {
                    high--;
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
            }
        }

        return list;
    }
}