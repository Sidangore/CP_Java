package org.siddhantangore.projectEuler;

import java.util.HashSet;
import java.util.Set;

/**
 * 999
 * 1 X 999
 * 3 x 333
 * 9 x 111
 * 27 x 37
 *
 * 6 = 1 2 3
 * 1 = 1
 */
public class Question_21 {
    public static void main(String[] args) {
        int N = 10_000, sum = 0, totalSum = 0;
        Set<Integer> set = new HashSet<>();

        // find proper divisors
        // get sum of divisors
        // we need to find the divisors of the sum
        // and check if the sum == number

        for (int number = 1; number < N; number++) {
            // Find the divisors
            sum = getSumOfDivisorsOfN(number);

            if (number == getSumOfDivisorsOfN(sum)) {

                if (number != sum) {
                    if (!set.contains(number)) {
                        totalSum += (number + sum);
                        System.out.println("Amicable Pair : " + number + " & " + sum);
                        set.add(number); set.add(sum);
                    }
                }
            }
        }

        System.out.println("Total Sum = " + totalSum);

    }

    public static int getSumOfDivisorsOfN(int n) {
        int sum = 1;
        int sqRoot = (int) Math.sqrt(n);

        for (int i = 2; i <= sqRoot; i++) {
            if (n % i == 0) {
                sum += i;
                sum += (n/i);
            }
        }

        return sum;
    }
}


