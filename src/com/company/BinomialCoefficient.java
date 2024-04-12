package com.company;

public class BinomialCoefficient {
    public static int binomialCoefficient(int n, int k) {

        if (k == 0 || k == n) {
            return 1;
        }

        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        int result = binomialCoefficient(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
    }
}
