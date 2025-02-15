package com.exceptions.finallyblockexecution;

import java.util.Scanner;

public class DivisionOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the user

        try {
            // Prompt user to enter the first integer
            System.out.print("Enter the first integer: ");
            int dividend = scanner.nextInt();

            // Prompt user to enter the second integer
            System.out.print("Enter the second integer: ");
            int divisor = scanner.nextInt();

            // Perform the division
            int result = dividend / divisor;
            // Print the result of the division
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle the ArithmeticException if division by zero occurs
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // This block is always executed, whether an exception occurs or not
            System.out.println("Operation completed.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
