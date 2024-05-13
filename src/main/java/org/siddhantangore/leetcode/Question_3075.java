package org.siddhantangore.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class Question_3075 {
    public static void main(String[] args) {
        int[] happiness = {12,1,42}; //{12,1,42}; //{1, 2, 3}; // {1, 1, 1, 1}
        int k = 2;

        System.out.println(maximumHappinessSum(happiness, k));
    }

    /*public static long maximumHappinessSum(int[] happiness, int k) {
        int max = 0;

        for (int i = 0; i < k; i++) {
            max += (getMax(happiness) - i);
        }
        return max;
    }*/

    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        System.out.println(Arrays.toString(happiness));
        int max = 0, decrement = 0;

        for (int i = happiness.length - 1; i >= happiness.length - k; i--) {
            max += happiness[i] - decrement;
            decrement++;
        }
        return max;
    }

    public static int getMax(int[] happiness) {
        int index = 0, max = Integer.MIN_VALUE;
        for (int i  = 0; i < happiness.length; i++) {
            if (happiness[i] > max) {
                max = happiness[i];
                index = i;
            }
        }
        happiness[index] = 0;
        return max;
    }
}
