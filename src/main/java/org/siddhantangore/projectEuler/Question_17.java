package org.siddhantangore.projectEuler;

import java.util.HashMap;
import java.util.Map;

/**
 * 1XX one hundred and (XX)
 * 2XX two hundred and ()
 * 6xx six hundred and ()
 *
 * 2x twenty (x)
 * 8x
 * 9x
 *
 * 1 - 20 = 112
 * 21 - 1000
 *
 */
public class Question_17 {
    public static String[]
            ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"},
            tens = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static void main(String[] args) {
        int sum = 0;
        String res = "";
        for (int i = 1; i <= 1000; i++) {
            res = toWords(i);
            int length = res.replace(" ", "").replace("-", "").trim().length();
            sum += length;
            System.out.println("Number " + i + " in words is " + res + " with length of " + length + ", sum is " + sum);
        }
        System.out.println("Final sum is " + sum);
    }

    private static String toWords(int number) {
        if (0 <= number && number < 20) {
            return ones[number];
        } else if (20 <= number && number < 100) {
            return tens[number / 10] + (number % 10 == 0 ? "" : "-" + ones[number % 10]);
        } else if (100 <= number && number < 1000) {
            return ones[number / 100] + " Hundred" + (number % 100 == 0 ? "" : " and " + toWords(number % 100));
        } else if (1000 <= number && number < 1000000)
            return toWords(number / 1000) + " Thousand" + (number % 1000 == 0 ? "" : toWords(number % 1000));
        return "";
    }
}
