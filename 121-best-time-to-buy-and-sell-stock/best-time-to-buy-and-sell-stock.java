class Solution {
    public int maxProfit(int[] prices) {
        int minprize=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            minprize= Math.min(minprize, prices[i]);
            int profit= prices[i]-minprize;
            maxprofit=Math.max(maxprofit,profit);
        }

        return maxprofit;
    }
}