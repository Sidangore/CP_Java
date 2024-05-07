package org.siddhantangore.projectEuler;

import java.math.BigInteger;

public class Question_16 {
    public static void main(String[] args) {
        int power = 1000, base = 2;
        BigInteger number = getPoweredNumber(base, power);
        System.out.println("Number " + number);
        int sumOfDigits = getSumOfDigits(number);
        System.out.println("Sum of digits = " + sumOfDigits);
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

    private static BigInteger getPoweredNumber(int base, int power) {
        BigInteger result = BigInteger.valueOf(base);
        return result.pow(power);
    }
}
