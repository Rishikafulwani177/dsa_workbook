class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(HashMap.Entry <Integer,Integer> entry: map.entrySet()){
            int freq= entry.getValue();
            if(freq>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}