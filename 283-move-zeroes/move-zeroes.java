class Solution {
    public void moveZeroes(int[] nums) {
        int k=nums.length;
        int[] arr= new int[k];
        int p=0;
        for(int i=0; i<k ;i++){
            if(nums[i]!=0){
                arr[p]= nums[i];
                p++;
            }
        }
        while(p<k){
            arr[p]=0;
            p++;
        }
        for(int i=0; i<k; i++){
            nums[i]=arr[i];
        }
        return;
    }
}