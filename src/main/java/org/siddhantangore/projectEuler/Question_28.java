package org.siddhantangore.projectEuler;
// Number Spiral Diagonal
public class Question_28 {
    public static void main(String[] args) {
        int n = 1001;
        getSpiralMatrix(n);
    }

    private static void getSpiralMatrix(int n) {
        if (n % 2 == 0) {
            System.out.println("Number should be odd");
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int sum = 1, c1 = 0, subtractor = 2;
        for (int number = 3; number <= n; number += 2) {
            c1 = number * number;
            sum += (c1 * 4) - (6 * subtractor);
            subtractor += 2;
        }

        System.out.println("Sum = " + sum);
    }
}
