package org.siddhantangore.projectEuler;

/*
    https://projecteuler.net/problem=7
    To find the 10001 st prime number
*/

import java.util.*;

public class Question_7 {
    public static void main(String[] args) {
        int n = 10_001, sizeMultiplier = 2, totalPrimes = 0;
        int size = n * sizeMultiplier;

        List<Integer> primeList = sieveOfErastosthenes(size);
        totalPrimes = primeList.size();

        System.out.println("Initial Total Primes = " + totalPrimes);

        while (totalPrimes < n) {
            sizeMultiplier++;
            size = n * sizeMultiplier;
            primeList = sieveOfErastosthenes(size);
            totalPrimes = primeList.size();
            System.out.println("Total Primes = " + totalPrimes);
        }

        System.out.println("Nth prime is " + primeList.get(n-1));
    }

    public static List<Integer> sieveOfErastosthenes(int size) {
        List<Boolean> primeBoolean = new ArrayList<>();

        // Initialize the boolean primes with false 2 onwards
        primeBoolean.add(0, false);
        primeBoolean.add(1, false);
        for (int i = 2; i <= size; i++) {
            primeBoolean.add(true);
        }

        // Set primes as true and others as false
        for (int p = 2; p*p <= size; p++) {
            if (primeBoolean.get(p)) {
                for (int i = p*p; i <= size; i += p) {
                    if (primeBoolean.get(i))
                        primeBoolean.set(i, false);
                }
            }
        }

        // Create an only primes list and send
        List<Integer> onlyPrimes = new ArrayList<>();
        for (int i = 0; i < primeBoolean.size(); i++) {
            if (primeBoolean.get(i)) {
                onlyPrimes.add(i);
            }
        }

        return onlyPrimes;
    }
}
