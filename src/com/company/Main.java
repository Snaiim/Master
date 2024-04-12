package com.company;
public class Main
{
    static int getmin(int arr[], int n){
        // Base case: if there's only one element in the array, return it
        if(n==1)
            return arr[0];
        return Math.min(arr[n-1], getmin(arr, n-1));
    }
    // Recursively call the function for the subarray without the last element
    // and compare the result with the last element to find the minimum value
    public static void main(String args[])
    {
        int arr[] = {10, 1, 32, 3, 45};
        int n = arr.length;
        System.out.print(getmin(arr, n)); // Print the minimum element
    }
}