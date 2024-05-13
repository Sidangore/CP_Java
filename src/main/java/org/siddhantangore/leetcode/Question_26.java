package org.siddhantangore.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1, i = 1;
        List<Integer> list = new ArrayList<>();

        for (; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                list.add(nums[i - 1]);
                k++;
            }
        }
        list.add(nums[nums.length - 1]);

        for (i = 0; i < k; i++) {
            nums[i] = list.get(i);
        }
//        System.out.println(Arrays.toString(nums));
        return k;
    }
}
