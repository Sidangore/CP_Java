package org.siddhantangore.projectEuler;

import java.math.BigInteger;

/*
https://projecteuler.net/problem=2
 */
public class Question_2 {
    public static void main(String[] args) {
        BigInteger t1 = BigInteger.ONE, t2 = BigInteger.TWO, t3 = BigInteger.ZERO, sum = BigInteger.TWO;
        for (int i = 3; i < 100; i++) {
            t3 = t1.add(t2);
            t1 = t2;
            t2 = t3;

            if (t3.compareTo(BigInteger.valueOf(4_000_000)) < 0) {
                if (t3.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
                    System.out.print(t3 + " ");
                    sum = sum.add(t3);
                }
            } else {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
