class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int low = prices[0];
        int profit = 0;
        for (int i = 1; i < n; i++) {
            low = Math.min(low,prices[i]);
            int temp = prices[i]-low;
            profit = Math.max(temp,profit);
            
        }
        return profit;
    }
}