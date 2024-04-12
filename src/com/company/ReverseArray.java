package com.company;

public class ReverseArray {
    public static void reverse(int[] array) {
        if (array == null || array.length <= 1) {
            return;

        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 4 };
        reverse(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
