package org.siddhantangore.crackingthecodinginterview.bigo;

/**
 * What is the runtime of the below code?
 */
public class Ex4 {
    public static void printUnorderedPairs (int[] array) {
        for (int i: array) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    public static void main(String[] args) {
        printUnorderedPairs (new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }
}
/*
    The TC of the following code is O(N^2)

    So in this example the array is {1, 2, 3, 4, 5, 6, 7, 8}
    The length of the array is 8
    the i will run from i = 0 to 7
    and j will run from i + 1 (1) to 7

    Therefore,
        the insides of the j will run for
        => (N-1) + (N-2) + (N-3) + till it runs for 1 times + 3 + 2 + 1
        => Sum of 1st (N - 1) terms
        => (N-1)(N-1+1) / 2
        => N(N-1) / 2

        => O(N^2)
 */