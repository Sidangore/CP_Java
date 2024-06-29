package org.siddhantangore.dataStructuresAndAlgorithms.arrays;

public class MaxConsecutive1 {
    public static void main (String[] args) {
        int[][] testcases = {{0, 1, 1, 0, 1, 0}, {1, 1, 1, 1}, {0, 0 ,0}, {1, 0, 1, 1, 1, 1, 0, 1, 1}};
        for (int[] testcase: testcases) {
            System.out.println("Max consecutive zeroes = " + getMaxConsecutiveZerores(testcase));
        }
    }

    public static int getMaxConsecutiveZerores(int[] arr) {
        int max = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
