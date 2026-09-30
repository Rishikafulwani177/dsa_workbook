class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int lowest=prices[0];
        for(int i=1; i<prices.length; i++){
            int profit= prices[i]-lowest;
            res=Math.max(profit,res);
            lowest=Math.min(lowest,prices[i]);
        }
        return res;
    }
}