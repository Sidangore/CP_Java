package org.siddhantangore.projectEuler;

import java.math.BigInteger;

public class Question_14 {
    public static void main(String[] args) {
        BigInteger maxLimit = new BigInteger("1000000"), number = new BigInteger("500000");
        int chainLength = 0, tempChainLength = 0;

        while (number.compareTo(maxLimit) <= 0) {
            tempChainLength = getChainLength(number);

            if (tempChainLength > chainLength) {
                chainLength = tempChainLength;
                System.out.println("Max Length = " + chainLength + " for " + number);
            }

            number = number.add(BigInteger.ONE);
        }
    }

    private static int getChainLength(BigInteger number) {
        int chainLength = 0;
        while (number.compareTo(BigInteger.ONE) > 0) {
            chainLength++;
            if (number.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
                number = number.divide(BigInteger.TWO);
            } else {
                number = number.multiply(BigInteger.valueOf(3));
                number = number.add(BigInteger.ONE);
            }
        }
//        System.out.println("Final chain length = " + chainLength);
        return chainLength;
    }
}
