package array;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profit = 0;
        int min = prices[0];
        int max = prices[0];

        for (int i = 0; i < prices.length - 1; i++) {
            if (max > prices[i + 1]) {
                profit = profit + (max - min);
                min = prices[i + 1];
                max = prices[i + 1];
            } else {
                max = prices[i + 1];
            }

        }
        profit = profit + (max - min > 0 ? max - min : 0);
        return profit;
    }
}
