class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res= new int[nums.length];
        int evenidx= 0;
        int oddidx= 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                //negative 
                res[oddidx]=nums[i];
                oddidx+=2;
            } else {
                //positive
                res[evenidx]=nums[i];
                evenidx+=2;
            }
        }
        return res;
    }
}