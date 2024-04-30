package org.siddhantangore.projectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.siddhantangore.projectEuler.Question_3.isPrime;

/*
https://projecteuler.net/problem=5
 */
public class Question_5 {
    public static void main(String[] args) {
        int lcm = 1;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> listOfPrimesTill20, otherNumbers;

        for (int i = 2; i <= 20; i++) arrayList.add(i);
        listOfPrimesTill20 = arrayList.stream().filter(x -> isPrime(x) && x > 10).toList();
        otherNumbers = arrayList.stream().filter(x -> !isPrime(x)).toList();

        lcm = getLcm(otherNumbers);
        int lcm2 = getLcm(listOfPrimesTill20);

        System.out.println(lcm * lcm2);

    }

    private static int getLcm(List<Integer> arr) {
        int lcm = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int num1 = lcm;
            int num2 = arr.get(i);
            int gcdValue = gcd(num1, num2);
            lcm = (lcm * arr.get(i)) / gcdValue;
        }
        return lcm;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
