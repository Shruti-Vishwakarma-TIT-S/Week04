package com.junittesting.basicjunit;

public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract one integer from another
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide one integer by another
    // Throws an ArithmeticException if dividing by zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    // Main method to run the Calculator class
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example usage of the Calculator methods
        System.out.println("Addition: " + calculator.add(2, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 2));
        System.out.println("Multiplication: " + calculator.multiply(4, 3));
        System.out.println("Division: " + calculator.divide(8, 2));

        // Uncomment to test division by zero
        // System.out.println("Division by zero: " + calculator.divide(1, 0));
    }

}

