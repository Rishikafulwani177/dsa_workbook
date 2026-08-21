class Solution {
    public int jump(int[] nums) {
        int res=0;
        int i=0;
        while(i<nums.length){
            if(i==nums.length-1){
                break;
            }
            res++;
            int m=0;
            int next=i;
            for(int j=i+1; j<=i+nums[i]; j++){
                if(j==nums.length-1){
                    return res;
                }
                if(j+nums[j]>=m){
                    m=j+nums[j];
                    next=j;
                }
            }
            i=next;
        }
        return res;
    }
}