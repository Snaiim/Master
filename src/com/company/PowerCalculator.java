package com.company;

public class PowerCalculator {
    public static double power(double a, int n) {

        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        double a = 2;
        int n = 10;
        double result = power(a, n);
        System.out.println(a + "^" + n + " = " + result);
    }
}
