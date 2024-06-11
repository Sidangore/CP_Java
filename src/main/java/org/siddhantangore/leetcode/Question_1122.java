package org.siddhantangore.leetcode;
// 1122. Relative Sort Array

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 */
public class Question_1122 {
    public static void main(String[] args) {
        int[] arr1 = {28,6,22,8,44,17}, arr2 = {22,28,8,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int length = arr1.length, k = 0;
        int[] arr3 = new int[length];
        Set<Integer> set = new HashSet<>();

        for (int num: arr1) set.add(num);
        for (int num: arr2) {

            for (int i = 0; i < length; i++) {
                if (num == arr1[i]) {
                    arr3[k++] = num;
                    set.remove(num);
                }
            }
        }
        for (int num: arr1) {
            if (set.contains(num)) {
                arr3[k++] = num;
            }
        }

        return arr3;
    }
}
