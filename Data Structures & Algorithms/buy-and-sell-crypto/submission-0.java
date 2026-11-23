class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = 0;
        int maxProfit = 0;
        for(int sell=1; sell<n; sell++){
            int profit = prices[sell] - prices[buy];
            maxProfit = Math.max(maxProfit, profit);
            if(profit <= 0) buy = sell;
        }
        return maxProfit;
    }
}
