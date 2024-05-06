package org.siddhantangore.projectEuler;

import java.util.HashSet;
import java.util.Set;

import static org.siddhantangore.projectEuler.Question_3.isPrime;

public class Question_12 {
    public static void main(String[] args) {
        int n = 1;
        int triangleNumber = getTriangleNumber(n);
        System.out.println(triangleNumber);
        int numberOfFactors = 1; // getNumberOfFactors(triangleNumber);
        System.out.println(numberOfFactors);

        while (numberOfFactors < 500) {
            n++;
            triangleNumber = getTriangleNumber(n);
            System.out.println("Triangle Number = " + triangleNumber);
            numberOfFactors = getNumberOfFactors(triangleNumber);
            System.out.println("Number of Factors = " + numberOfFactors);
        }
        System.out.println("Final Triangle Number = " + triangleNumber);
        System.out.println("Final Number of Factors = " + numberOfFactors);
    }

    private static int getNumberOfFactors(int triangleNumber) {
        if (triangleNumber == 1) return 1;
        else if (isPrime(triangleNumber)) return 2;

        Set<Integer> factorsSet = new HashSet<>();

        for (int i = 1; i*i <= triangleNumber; i++) {
            if (triangleNumber % i == 0) {
                factorsSet.add(i);
                factorsSet.add(triangleNumber / i);
                System.out.println("factor " + factorsSet);
            }
        }

        return factorsSet.size();
    }

    private static int getTriangleNumber(int n) {
        return n*(n+1)/2;
    }
}
