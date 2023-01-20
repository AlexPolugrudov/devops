package solutions.solution_0121;

public class Solution {
    public int maxProfit(int[] prices) {

        int max_profit = 0;
        int current_min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];

            max_profit = Math.max(max_profit, price - current_min);
            current_min = Math.min(current_min, price);
        }

        return max_profit;

    }
}
