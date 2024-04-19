package org.siddhantangore.crackingthecodinginterview.bigo;
/*
What is the run time of the below code?
 */
public class Ex2 {
    public static void foo (int[] array) {
        int sum = 0;
        int product = 1;

        for (int j : array) {
            sum += j;
        }

        for (int j : array) {
            product *= j;
        }

        System.out.println(sum + " " + product);
    }

    public static void main(String[] args) {
        foo (new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }
}

/*
  Time complexity is O(N)
  and space complexity is O(1)

  This is because the first for loop runs N times
  and the second for loop runs for the N times
  and the space required for sum and product is O(1) i.e. constant

  Hence, it is O(N) + O(N) = O(2N) = O(N)
 */