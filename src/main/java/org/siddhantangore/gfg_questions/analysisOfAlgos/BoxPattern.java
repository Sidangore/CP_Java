package org.siddhantangore.gfg_questions.analysisOfAlgos;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            int n = sc.nextInt();

            boxPatternPrinter(n);
        }
    }

    private static void boxPatternPrinter(int n) {
        int side = n*2 - 1;

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(1 + Math.min(Math.min(i, j), Math.min(side - 1 - i, side - 1 - j)));
            }
            System.out.println();
        }
    }
}
