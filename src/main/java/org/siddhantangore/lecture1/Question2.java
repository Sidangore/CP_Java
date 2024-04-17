package org.siddhantangore.lecture1;

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/contest/1933/problem/B">Question 2</a>
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0, count = 0;
            boolean is1Present = false;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                sum += a[i];
                if (a[i] % 3 == 1) {
                    is1Present = true;
                }
            }

            if (sum % 3 == 0) {
              count = 0;
            } else if (sum % 3 == 2) {
                count = 1;
            } else {
                if (is1Present) {
                    count = 1;
                } else {
                    count = 2;
                }
            }

            System.out.println(count);
        }
    }
}
