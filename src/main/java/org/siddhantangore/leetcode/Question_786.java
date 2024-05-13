package org.siddhantangore.leetcode;

import java.util.*;

public class Question_786 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, 3)));
    }
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Comparator<Double> comparator = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o1, o2);
            }
        };

        Map<Double, Integer[]> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double fraction = (double) arr[i]/arr[j];
                map.put(fraction, new Integer[]{arr[i], arr[j]});
            }
        }
        int i = 0;
        for (Integer[] value: map.values()) {
            if (i == k - 1) {
                return Arrays.stream(value).mapToInt(e -> e).toArray();
            }
            i++;

        }

        return new int[]{0, 0};
    }
}
