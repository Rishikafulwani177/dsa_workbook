class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> list= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<nums.length-2; j++){
                if (j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                long s=(long) target-(nums[i]+nums[j]);
                int low=j+1;
                int high=nums.length-1;

                while(low<high){
                    long n=(long)nums[low]+nums[high];
                    if(s==n){
                        list.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        low++;
                        while(low<high && nums[low]==nums[low-1]){
                            low++;
                        }

                        high--;
                        while(low<high && nums[high]==nums[high+1]){
                            high--;
                        }
                    } else if(s>n){
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
        }

        return list;
    }
}