package org.siddhantangore.gfg_cp.arrays1;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 10, 0, 20};
        System.out.println(Arrays.toString(arr));
        moveZeroToEnd(arr);

    }

    public static void moveZeroToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr[i], arr[count++]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int i, int i1) {
        int temp = i;
        i = i1;
        i1 = temp;
    }
}
