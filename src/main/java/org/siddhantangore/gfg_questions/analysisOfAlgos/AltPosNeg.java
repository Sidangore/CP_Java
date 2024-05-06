package org.siddhantangore.gfg_questions.analysisOfAlgos;

import java.util.ArrayList;
import java.util.Scanner;

/*
2
9
9 4 -2 -1 5 0 -5 -3 2
9
-9 4 -2 -1 5 0 -5 -3 2

*/

public class AltPosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        while (testcases-- > 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            alternativePosAndNeg(array, n);

            for (int i: array) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

    private static void alternativePosAndNeg(int[] array, int n) {
        ArrayList<Integer> positive = new ArrayList<>(), negative = new ArrayList<>();

        for (int element: array) {
            if (element >= 0) {
                positive.add(element);
            } else {
                negative.add(element);
            }
        }

        int index = 0, pos = 0, neg = 0;

        while (pos < positive.size() && neg < negative.size()) {
            if (index%2 == 0) {
                array[index++] = positive.get(pos++);
            } else {
                array[index++] = negative.get(neg++);
            }
        }

        while (pos < positive.size()) {
            array[index++] = positive.get(pos++);
        }

        while (neg < negative.size()) {
            array[index++] = negative.get(neg++);
        }
    }
}
