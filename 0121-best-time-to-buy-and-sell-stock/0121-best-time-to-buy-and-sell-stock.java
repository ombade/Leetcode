class Solution {
    public int maxProfit(int[] prices) {
        int minday = 0;
        int maxprofit = -99999;
        int buy = 99999;
        int sell = -99999;
        for(int i  =0 ; i< prices.length ; i++)
        {
            buy = Math.min(buy , prices[i]);
            // sell = Math.max(sell , prices[i]);
            maxprofit = Math.max(maxprofit,prices[i] -buy);

        }
        return maxprofit;
        
    }
}