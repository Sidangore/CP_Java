package org.siddhantangore.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question_826 {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        for (int workerDifficulty : worker) {
            int tempProfit = 0;
            for (int i = 0; i < difficulty.length; i++) {
                if (difficulty[i] <= workerDifficulty) {
                    tempProfit = Math.max(profit[i], tempProfit);
                }
            }
            maxProfit += tempProfit;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] difficulty = {66, 1, 28, 73, 53, 35, 45, 60, 100, 44, 59, 94, 27, 88, 7, 18, 83, 18, 72, 63};
        int[] profit =     {66, 20, 84, 81, 56, 40, 37, 82, 53, 45, 43, 96, 67, 27, 12, 54, 98, 19, 47, 77};
        int[] worker =     {61, 33, 68, 38, 63, 45, 1, 10, 53, 23, 66, 70, 14, 51, 94, 18, 28, 78, 100, 16}; // 4 4 6 6

        System.out.println("Max profit = " + maxProfitAssignment(difficulty, profit, worker));
    }
}
