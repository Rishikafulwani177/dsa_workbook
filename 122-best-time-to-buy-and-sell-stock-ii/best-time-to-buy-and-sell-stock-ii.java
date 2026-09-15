class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }

        int res=0;
        int buy=prices[0];
        int i=0;
        int sell=prices[0];

        while(i<prices.length){
            if(prices[i] < prices[i+1]){
                sell=prices[i+1];
                i++;
            } else {
                res+= sell - buy;
                buy= prices[i+1];
                sell= prices[i+1];
                i++;
            }
            if(i==prices.length-1){
                if(buy<sell){
                    res+= sell-buy;
                }
                break;
            }
        }

        return res;
    }
}