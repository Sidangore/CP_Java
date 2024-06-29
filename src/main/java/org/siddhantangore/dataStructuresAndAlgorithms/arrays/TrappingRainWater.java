package org.siddhantangore.dataStructuresAndAlgorithms.arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[][] testcases = {{2, 0, 2}, {3, 0, 1, 2, 5}, {2, 1, 2, 3}, {3, 2, 1}};
        for (int[] testcase: testcases) {
            System.out.println("Water trapped = " + waterTrapped2(testcase));
        }
    }
    /**
     * The waterTrapped method calculates the total water trapped by iterating through each bar, finding the maximum heights to the left and right of each bar,
     * and summing the difference between the minimum of these heights and the bar's height for each position.
     * The sum of these differences gives the total amount of water trapped.
     *
     * Time complexity is O(n^2)
     */
    public static int waterTrapped(int[] arr) {
        int waterTrapped = 0;
        for (int bar = 1; bar < arr.length - 1; bar++) {
            int leftMax = arr[bar], rightMax = arr[bar];
            for (int i = 0; i < bar; i++) {
                leftMax = Math.max(leftMax, arr[i]);
            }
            for (int i = bar; i < arr.length; i++) {
                rightMax = Math.max(rightMax, arr[i]);
            }
            waterTrapped += Math.min(leftMax, rightMax) - arr[bar];
        }
        return waterTrapped;
    }

    public static int waterTrapped2 (int[] arr) {
        int waterTrapped = 0;
        int[] leftMax = new int[arr.length], rightMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        for (int i = 1; i < arr.length - 1; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        return waterTrapped;
    }
}
