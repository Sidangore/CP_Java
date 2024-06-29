package org.siddhantangore.leetcode;

public class Question_1438 {
    public static int longestSubarray(int[] nums, int limit) {
        int maxLength = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int max = Math.min(Integer.MAX_VALUE, nums[i] + limit);
            int min = Math.max(nums[i] - limit, 0);
            int length = 1;
            for (int j = i + 1; j < nums.length; j++) {
//                 System.out.println("i = " + nums[i] + ", j = " + nums[j] + ", max = " + max + ", min = " + min);
                if (min <= nums[j] && nums[j] <= max) {
                    length++;
                    max = Math.min(max, nums[j] + limit);
                    min = Math.max(nums[j] - limit, min);
                } else {
                    break;
                }
//                 System.out.println("Length with in " + nums[i] + " = " + length);
            }
//             System.out.println("Length with out " + nums[i] + " = " + length);
            if (maxLength < length) {
                maxLength = length;
            }
        }
        return maxLength;
    }
    public static void main (String[] args) {
        int[] arr = {10,1,2,4,7,2};
        int limit = 5;
        System.out.println("final length = " + longestSubarray(arr, limit));
    }
}
