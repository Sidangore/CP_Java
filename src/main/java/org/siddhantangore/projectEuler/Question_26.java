package org.siddhantangore.projectEuler;

import static org.siddhantangore.projectEuler.Question_3.isPrime;

/**
 * Reciprocal Cycles
 */
public class Question_26 {
    public static void main(String[] args) {
        double num = 0;
        for (int i = 2; i < 1000; i++) {
            num = (double) 1 / i;
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
