package com.junittesting.parameterized;

public class NumberUtils {
    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Main method to run the NumberUtils class
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();

        // Example usage of the isEven method
        System.out.println("2 is even: " + numberUtils.isEven(2));
        System.out.println("3 is even: " + numberUtils.isEven(3));
    }
}
