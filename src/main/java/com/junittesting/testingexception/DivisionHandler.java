package com.junittesting.testingexception;

public class DivisionHandler {
    // Method to divide one integer by another
    // Throws an ArithmeticException if dividing by zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    // Main method to run the DivisionHandler class
    public static void main(String[] args) {
        DivisionHandler handler = new DivisionHandler();

        // Example usage of the divide method
        System.out.println("Division: " + handler.divide(10, 2));

    }
}
