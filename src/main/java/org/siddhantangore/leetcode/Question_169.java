package org.siddhantangore.leetcode;

import java.util.*;

public class Question_169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("Majority element is " + getMajorityElement(nums));
    }

    private static int getMajorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        n /= 2;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
