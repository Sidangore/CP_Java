package org.siddhantangore.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 1 1 2 2 3 => 1 1 2 2 3
 */
public class Question_80 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1, index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                index = i - 1;

            } else {
                index = i;
            }
        }

        return k;
    }
}
