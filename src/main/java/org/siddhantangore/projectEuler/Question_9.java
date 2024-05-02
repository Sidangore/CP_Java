package org.siddhantangore.projectEuler;
/*
    https://projecteuler.net/problem=9
 */
public class Question_9 {
    public static void main(String[] args) {
        for (int c = 1; c < 500; c++) {
            for (int b = 1; b < 500; b++) {
                for (int a = 1; a < 500; a++) {
                    if (isPythagoreanTriplet(a, b, c)) {
                        if (a + b + c == 1000) {
                            System.out.println("Triplet is = " + a + " " + b + " " + c);
                            System.out.println(a*b*c);
                            return;
                        }
                    }
                }
            }
        }
    }

    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}
