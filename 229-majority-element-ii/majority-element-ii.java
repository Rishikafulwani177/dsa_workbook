class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length/3;
        HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList <Integer> list= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int num= nums[i];
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
            int freq= entry.getValue();
            if(freq>n){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}