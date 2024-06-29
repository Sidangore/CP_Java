package org.siddhantangore.dataStructuresAndAlgorithms.arrays;

public class StockBuyAndSell {
    public static void main (String[] args) {
        int[][] testcases = {{1, 5, 3, 8, 12}, {30, 20, 10}, {10, 20, 30}, {1, 5, 3, 1, 2, 8}};
        for (int[] testcase: testcases) {
            System.out.println("Profit = " + stockBuyAndSell(testcase));
        }
    }

    public static int stockBuyAndSell (int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
}
