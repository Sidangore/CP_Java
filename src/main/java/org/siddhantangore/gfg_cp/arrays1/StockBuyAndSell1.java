package org.siddhantangore.gfg_cp.arrays1;

public class StockBuyAndSell1 {
    public static void main(String[] args) {
        int[] prices = {1, 5, 3, 8, 12};

        System.out.println("Max profit is " + getMaxProfit(prices));
    }

    private static int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        for (int day = 1; day < prices.length; day++) {
            if (prices[day] > prices[day - 1]) {
                maxProfit += prices[day] - prices[day - 1];
            }
        }
        return maxProfit;
    }
}
