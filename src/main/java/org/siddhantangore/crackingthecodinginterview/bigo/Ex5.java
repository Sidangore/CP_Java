package org.siddhantangore.crackingthecodinginterview.bigo;

/**
 * What is the runtime of the below code?
 */
public class Ex5 {
    public static void printUnorderedPairs (int[] arrayA, int[] arrayB) {
        for (int i: arrayA) {
            for (int j: arrayB) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
    }

    /**
     * The TC for this code is also O(ab)
     * where a is the length of array a
     * and b is the length of array b
     *
     * The 100_00 unit of work that is constant in nature is O(1)
     * Hence, the overall time complexity is same as O(ab)
     *
     * @param a
     * @param b
     */
    public static void printUnorderedPairsWithConstant (int[] a, int[] b) {
        for (int i: a) {
            for (int j: b) {
                for (int k = 0; k < 10000; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}

/*
    TC is O(N*M)
 */
