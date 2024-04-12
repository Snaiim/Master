package com.company;

public class DigitChecker {
    public static boolean allDigits(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "123abc";

        System.out.println("s1 consists only of digits: " + allDigits(s1));
        System.out.println("s2 consists only of digits: " + allDigits(s2));
    }
}
