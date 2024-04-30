package org.siddhantangore.projectEuler;
/*
https://projecteuler.net/problem=6
 */
public class Question_6 {
    public static void main(String[] args) {
        int n = 100;
        int sumOfSquare = n*(n + 1)*(2*n + 1)/6;
        int sumAndSquare = (int) Math.pow((double) (n * (n + 1)) /2, 2);
        System.out.println("Answer = " + (sumAndSquare - sumOfSquare));
    }
}
