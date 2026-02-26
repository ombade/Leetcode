class Solution {
    public int maxProfit(int[] prices) {
        // int n = prices.length;
        // int profit = -99999;
        // for(int i = 0;i< n ; i++)
        // {
        //     for(int j = i ; j<n;j++ )
        //     {
        //         profit = Math.max(profit , (prices[j]- prices[i]));
        //     }
        // }
        // return profit;
        int n  = prices.length;
        int minby = prices[0];
        int profit = -9999;
        for(int i = 0; i< n ; i++)
        {
            minby = Math.min(minby , prices[i]);
            profit = Math.max(profit , (prices[i]-minby));
        }
        return profit;
        
    }
}