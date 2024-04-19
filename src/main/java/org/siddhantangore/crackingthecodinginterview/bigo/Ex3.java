package org.siddhantangore.crackingthecodinginterview.bigo;

/**
 * What is the runtime of the below code?
 */
public class Ex3 {
    public static void printPairs(int[] array) {
        for (int k : array) {
            for (int i : array) {
                System.out.println(k + ", " + i);
            }
        }
    }

    public static void main(String[] args) {
        printPairs (new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }
}

/*
  The TC is O(N^2)
  => This is because, we are calling another for loop inside a for loop
  It is a nested for loop = N x N => N^2

  and SC is O(1)
  => As no additional space or variables are required
 */
