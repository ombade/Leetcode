class Solution {
    public int maxProfit(int[] prices) {
        int minelement = 999999;
        int profit = 0;
        for(int i : prices)
        {
            minelement = Math.min(i, minelement);
            profit = Math.max(profit , i- minelement);
        } return profit;
    }
//    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/3914105/most-optimized-solution-easy-to-understand-c-java-python
}