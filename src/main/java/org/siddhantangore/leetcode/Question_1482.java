package org.siddhantangore.leetcode;

public class Question_1482 {
    public static int minDays (int[] bloomDay, int m, int k) {
        int days = 0;
        for (int day = 0; day <= bloomDay.length - k; day += k) {
            int minimumDay = 0;
            for (int consecutiveDay = day; consecutiveDay < day + k; consecutiveDay++) {
                minimumDay = Math.max(minimumDay, bloomDay[consecutiveDay]);
                if (minimumDay >= days) {
                    days = minimumDay;
                    if (m > 0) {
                        m--;
                    } else {
                        return days;
                    }
                }
            }
            System.out.println("Min day = " + minimumDay);
        }

        return 0;
    }
    public static void main (String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};
        int k = 3, m = 2;
        System.out.println("Min days = " + minDays(bloomDay, m, k));
    }
}
