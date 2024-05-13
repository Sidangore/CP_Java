package org.siddhantangore.projectEuler;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * 12 = 1 2 3 4 6
 * 25 = 1 5
 */

public class Question_23 {
    public static final int limit = 28124;
    public static Set<Integer> setOfAbundant = new HashSet<>();
    public static int totalSum = 0;
    public static void main(String[] args) {
        setAbundantSet();

        System.out.println("Total sum before = " + totalSum);
        System.out.println("SET = " + setOfAbundant);

        calculateSumOfNumberWhichAreNotSumOf2Abundants();

        System.out.println("Total sum after = " + totalSum);
    }

    private static void calculateSumOfNumberWhichAreNotSumOf2Abundants() {
        for (int number = 0; number < limit; number++) {
            if (!isSumOfAbundant(number, setOfAbundant)) {
                totalSum +=  number;
                System.out.println("Number added = " + number);
            }
        }
    }

    private static void setAbundantSet() {
        for (int number = 1; number < limit; number++) {
            if (isAbundant(number)) {
                setOfAbundant.add(number);
            }
        }
    }

    private static boolean isSumOfAbundant(int number, Set<Integer> setOfAbundant) {
        for (int i = 0; i <= number; i++) {
            if (setOfAbundant.contains(i) && setOfAbundant.contains(number - i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAbundant(int n) {
        int sumOfDivisors = getSumOfDivisorsOfN(n);
        return sumOfDivisors > n;
    }


    public static int getSumOfDivisorsOfN(int n) {
//        System.out.println("Number = " + n);
        int sum = 1;
        for (int i = 2; i < (n/2 + 1); i++) {
            if (n % i == 0) {
                sum += i;
//                System.out.print(i + " ");
            }
        }
//        System.out.println();
        return sum;
    }

}
