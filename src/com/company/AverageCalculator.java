package com.company;

public class AverageCalculator {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        // Пример использования:
        int[] numbers = {1, 2, 3, 4 };
        double average = calculateAverage(numbers);
        System.out.println(average);
    }
}
