package org.siddhantangore.projectEuler;

import java.math.BigInteger;

public class Question_20 {
    public static void main(String[] args) {
        int n = 100;
        BigInteger result = getFactorialOfNumber(n);
        System.out.println("Factorial " + result);
        int sumOfDigits = getSumOfDigits(result);
        System.out.println("Sum of digits = " + sumOfDigits);
    }

    private static BigInteger getFactorialOfNumber(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private static int getSumOfDigits(BigInteger number) {
        int sumOfDigits = 0;
        while (number.compareTo(BigInteger.ZERO) != 0) {
            int remainder = number.remainder(BigInteger.TEN).intValue();
            sumOfDigits += remainder;
            number = number.divide(BigInteger.TEN);
        }
        return sumOfDigits;
    }
}
