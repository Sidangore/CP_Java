package org.siddhantangore.projectEuler;

import java.math.BigInteger;
import java.util.List;

import static org.siddhantangore.projectEuler.Question_7.sieveOfErastosthenes;

/*
    https://projecteuler.net/problem=10
 */
public class Question_10 {
    public static void main(String[] args) {
        List<Integer> primes = sieveOfErastosthenes(2_000_000_00);
        //System.out.println(sieveOfErastosthenes(2_000_000).stream().reduce(Integer::sum).stream().toList());
        BigInteger sum = BigInteger.ZERO;
        for (int i: primes) {
            if (i < 2_000_000) {
                sum = sum.add(BigInteger.valueOf(i));
            } else {
                break;
            }

        }
        System.out.println("SUM = " + sum);
    }
}
