//1. Burte force
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i + 1; j < prices.length; j++) {
                profit = Math.max(profit ,prices[j] - prices[i]);
            }
        }
        return profit;
    }
}

//2. greedy
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length ; i++){
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - minPrice);
            }
        }
        return profit;
    }
}