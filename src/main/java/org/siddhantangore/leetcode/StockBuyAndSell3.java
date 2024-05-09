package org.siddhantangore.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This question uses DP
 */
public class StockBuyAndSell3 {
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0, temp = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> buyDates = new ArrayList<>(), sellDates = new ArrayList<>(), profits = new ArrayList<>();

        for (int buyDate = 0; buyDate < prices.length - 1; buyDate++) {
            for (int sellDate = buyDate + 1; sellDate < prices.length; sellDate++) {
                temp = prices[sellDate] - prices[buyDate];
                if (temp > 0) {
                    buyDates.add(buyDate);
                    sellDates.add(sellDate);
                    profits.add(temp);
                }
            }
        }
        System.out.println(buyDates + "\n" + sellDates + "\n" + profits + "\n");

        if (profits.isEmpty()) return 0;
        return profit;
    }
}
