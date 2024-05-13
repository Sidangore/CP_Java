package org.siddhantangore.leetcode;

import java.util.Arrays;

public class Question_189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(nums));
        rotateArrayByK(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateArrayByK(int[] nums, int k) {
        // Need to incorporate the logic of reversing an array
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
        reverseArray(nums, 0, nums.length - 1);
    }

    public static void reverseArray(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
