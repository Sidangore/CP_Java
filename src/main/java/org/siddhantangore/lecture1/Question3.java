package org.siddhantangore.lecture1;

import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long l = sc.nextInt();

            HashSet<Long> set = new HashSet<>();

            for (long ax = 1; ax <= l; ax *= a) {
                for (long by = 1; by <= l; by *= b) {
                    long product = ax * by;

                    if (l % product == 0) {
                        long k = l / product;
                        set.add(k);
                    }
                }
            }

            System.out.println(set.size());
        }
    }
}
