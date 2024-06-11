package org.siddhantangore.projectEuler;

import java.util.Map;

public class Question_30 {
    public static void main(String[] args) {
        int limit = 1_00_00_000, sumOfDigits = 0, sum = 0;


        for (int i = 2; i < limit; i++) {
            sumOfDigits = getSumOfDigits(i);
            if (sumOfDigits == i) {
                System.out.println(sumOfDigits);
                sum += i;
            }
        }

        System.out.println("sum is " + sum);
    }

    private static int getSumOfDigits(int n) {
        int sum = 0, digit = 0;
        while (n != 0) {
            digit = (n % 10);
            sum += (int) Math.pow(digit, 5);
            n /= 10;
        }
        return sum;
    }
}
