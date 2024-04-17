package org.siddhantangore.lecture1;

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/contest/1933/problem/A">Question 1</a>
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.abs(sc.nextInt());
            }

            System.out.println(sum);
        }
    }
}
