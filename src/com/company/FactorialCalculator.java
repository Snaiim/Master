package com.company;

public class FactorialCalculator {
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: multiply n by factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example number
        int result = factorial(n);
        System.out.println(n + "! = " + result);
    }
}
