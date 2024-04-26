package org.siddhantangore.leetcode;

public class Question_1137 {
    public int tribonacci(int n) {
        int t0 = 0, t1 = 1, t2 = 1, result = 0;

        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;

        for (int i = 3; i <= n; ++i) {
            result = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = result;
        }

        return result;
    }
}
