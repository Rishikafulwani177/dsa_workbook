class Solution {
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[] freq){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                freq[i]=true;
                list.add(nums[i]);
                helper(nums, res, list, freq);
                list.remove(list.size()-1);
                freq[i]=false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        boolean freq[]= new boolean[nums.length];
        helper(nums, res, list, freq);
        return res;
    }
}