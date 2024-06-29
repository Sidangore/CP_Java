package org.siddhantangore.dataStructuresAndAlgorithms.arrays;

public class MaximumDifference {
    public static void main (String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("Get max diff = " + getMaxDiff2(arr));
    }

    public static int getMaxDiff (int[] arr) {
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (maxDiff < (arr[j] - arr[i])) {
                    maxDiff = arr[j] - arr[i];
                }
            }
        }
        return maxDiff;
    }

    public static int getMaxDiff2 (int[] arr) {
        if (arr.length == 1) {
            System.out.println("Invalid array provided");
            return -1;
        }
        int diff = arr[1] - arr[0], minValue = arr[0];
        for (int index = 1; index < arr.length; index++) {
            diff = Math.max(diff, arr[index] - minValue);
            minValue = Math.min(minValue, arr[index]);
        }
        return diff;
    }
}
