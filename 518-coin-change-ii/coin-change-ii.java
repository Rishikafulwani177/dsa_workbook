class Solution {
    public int fun(int i, int s, int[] coins, int amount, HashMap<String,Integer> dp){
        if(s==amount){
            return 1;
        }

        if(s>amount){
            return 0;
        }

        if(i==coins.length){
            return 0;
        }

        String key= i +","+s;
        if(dp.containsKey(key)){
            return dp.get(key);
        }

        int c1= fun(i, s+coins[i], coins, amount, dp);
        int c2= fun(i+1, s, coins, amount, dp);
        int ans= c1+c2;
        dp.put(key,ans);
        return ans;
    }

    public int change(int amount, int[] coins) {
        HashMap<String,Integer> dp= new HashMap<>();
        int res=fun(0,0,coins,amount,dp);
        return res;
    }
}