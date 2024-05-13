package org.siddhantangore.projectEuler;

import java.math.BigInteger;

public class Question_25 {
    public static void main(String[] args) {
        BigInteger number1 = BigInteger.ONE, number2 = BigInteger.ONE;
        BigInteger number3 = number1.add(number2);
        int index = 2;

        while (lengthOfNumber(number3) < 1000) {
            number3 = number1.add(number2);
            number1 = number2;
            number2 = number3;
            index++;
        }
        System.out.println("Final Number = " + number3);
        System.out.println("Final Index = " + index);
    }

    private static int lengthOfNumber(BigInteger number) {
        System.out.print("Number = " + number);
        int length = 0;
        while (number.compareTo(BigInteger.ZERO) > 0) {
            number = number.divide(BigInteger.TEN);
            length++;
        }
        System.out.print(" length = " + length);
        System.out.println();
        return length;
    }
}
