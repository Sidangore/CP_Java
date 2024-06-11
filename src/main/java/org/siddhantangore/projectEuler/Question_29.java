package org.siddhantangore.projectEuler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Question_29 {
    public static void main(String[] args) {
        int n = 100;
        BigInteger num = BigInteger.ONE;
        Set<BigInteger> set = new HashSet<>();
        for (BigInteger a = BigInteger.TWO; a.compareTo(BigInteger.valueOf(n)) <= 0; a = a.add(BigInteger.ONE)) {
            for (BigInteger b = BigInteger.TWO; b.compareTo(BigInteger.valueOf(n)) <= 0; b = b.add(BigInteger.ONE)) {
                num = a.pow(b.intValue());
                System.out.println(num);
                set.add(num);
            }
        }
        System.out.println("distinct elements = " + set.size());
    }
}
