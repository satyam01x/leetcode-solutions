class Solution {
    public int maxProfit(int[] prices) {
         int min_price = prices[0];
        int max_profit = 0;

        for(int i = 0; i < prices.length; i++) {

            min_price = Math.min(min_price, prices[i]);

            int profit = prices[i] - min_price;

            max_profit = Math.max(max_profit, profit);
        }

        return max_profit;
    }
    }
