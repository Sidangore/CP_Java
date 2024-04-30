package org.siddhantangore.projectEuler;

import static java.lang.Integer.reverse;

/*
https://projecteuler.net/problem=4
 */
public class Question_4 {
    public static boolean isPalindrome(int n) {
        int reverse = 0, temp = n;

        while (temp != 0) {
            reverse = (reverse * 10) + temp % 10;
            temp /= 10;
        }

        return reverse == n;
    }
    public static void main(String[] args) {
        int product = 0, largest = Integer.MIN_VALUE;

        for (int num1 = 999; num1 > 99; num1--) {
            for (int num2 = 999; num2 > 99; num2--) {
                product = num2 * num1;
                if (isPalindrome(product)) {
                    if (product > largest) largest = product;
                    break;
                }
            }
        }

        System.out.println("Largest = " + largest);
    }
}
