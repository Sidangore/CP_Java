package org.siddhantangore.crackingthecodinginterview.bigo;

/**
 * Explains the equivalence of different time complexities to O(N).
 * <ol>
 * <li>O(N + P) where P < N/2 is equivalent to O(N) because terms smaller than N can be disregarded in Big O notation.</li>
 * <li>O(2N) is equivalent to O(N) because constant factors are disregarded in Big O notation.</li>
 * <li>O(N + logN) is equivalent to O(N) because N grows faster than logN and thus dominates the time complexity.</li>
 * </ol>
 * O(N + M) is not necessarily equivalent to O(N) without knowledge of the relationship between N and M.
 */
public class Ex7 {
    public static void main(String[] args) {

    }

    /**
     * Discusses the time complexity of an algorithm given that N is significantly larger than P*2.
     * Under the assumption that N > P*2, the time complexity of the algorithm is considered to be O(N).
     */
    public static void f1 () {
        int n = 10, p = 4;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < p; i++) {
            System.out.println(i);
        }
    }

    /**
     * Analyzes the time complexity of the implemented algorithm.
     * This method operates with a linear time complexity, O(N), as the procedure runs through the sequence twice.
     * Although the raw count of operations is 2N, constant factors are omitted in Big O notation,
     * simplifying the time complexity to O(N).
     *
     * @param n The size of the input to the algorithm which determines the number of iterations.
     */

    public static void f2 (int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    /**
     * Performs a binary search to find the index of a target value within an array.
     * It operates by using two pointers, left and right, to narrow down the search.
     * The method calculates the middle index of the current search range and compares
     * the middle element to the target to determine if the target is present in the array.
     *
     * <p>The time complexity of this binary search algorithm is O(logN). However, if it's part
     * of a larger algorithm that includes a summation of elements or other operations with O(N) complexity,
     * the overall time complexity of the combined algorithm would be O(N), since N dominates logN.</p>
     *
     * @param array The sorted array in which to perform the binary search.
     * @param target The value to search for within the array.
     * @return The index of the target value if it's found; otherwise, -1.
     */
    public static int binarySearch (int[] array, int target) {
        int sum = 0;
        for (int i: array) {
            sum += i;
        }

        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = (array[left] + array[right]) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // This means that the array is not found in any array indices
    }
}
