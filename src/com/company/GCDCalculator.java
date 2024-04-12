package com.company;

public class GCDCalculator {
    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        int result = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result);
    }

}
