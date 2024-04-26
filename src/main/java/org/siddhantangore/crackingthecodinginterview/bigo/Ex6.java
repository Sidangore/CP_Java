package org.siddhantangore.crackingthecodinginterview.bigo;

import java.util.Arrays;

/**
 * What is the time complexity for the below code?
 */
public class Ex6 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5, 7, 8, 9};
        System.out.println("Before reversing: " + Arrays.toString(a));
        reverse(a);
        System.out.println("After reversing: " + Arrays.toString(a));
    }

    /**
     * Reverses the elements of an array.
     * <p>
     * The method loops only until the midpoint of the array, swapping elements at symmetric positions from the start and end. Despite the loop running for N/2 iterations, the time complexity remains O(N), since constants are disregarded in Big O notation.
     * </p>
     *
     * @param array The array to be reversed.
     */
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i - 1;
            int temporary = array[i];

            array[i] = array[other];
            array[other] = temporary;
        }
    }

    /**
     * This is the same as above code
     * just easier to understand
     *
     * @param array
     */
    public static void reverseEasierToUnderstand(int[] array) {
        for (int startIndex = 0; startIndex < array.length / 2; ++startIndex) {
            int lastIndex = array.length - startIndex - 1;
            int temporary = array[startIndex];

            array[startIndex] = array[lastIndex];
            array[lastIndex] = temporary;
        }
    }
}
