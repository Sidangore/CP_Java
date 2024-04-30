package org.siddhantangore.projectEuler;

import java.math.BigInteger;

/*
https://projecteuler.net/problem=3
 */
public class Question_3 {
    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        else if (n%2 == 0 || n%3 == 0) return false;

        for (int i = 5; i*i < n; i += 6) {
            if (n%i == 0 || n%(i + 2) == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "600851475143";
        BigInteger number = new BigInteger(str);
        int largest = Integer.MIN_VALUE;

        int sqRoot = number.sqrt().intValueExact();
        System.out.println(sqRoot);

        for (int i = 2; i <= sqRoot; i++) {
            if (isPrime(i)) {
                while (number.remainder(new BigInteger(String.valueOf(i))).compareTo(BigInteger.ZERO) == 0) {
                    number = number.divide(new BigInteger(String.valueOf(i)));
                    if (i > largest) largest = i;
                }
            }
        }
        System.out.println("Largest = " + largest);
    }
}
