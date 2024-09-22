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
   
}