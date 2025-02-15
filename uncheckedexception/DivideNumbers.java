package com.exceptions.uncheckedexception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the numerator from the user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            // Read the denominator from the user
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform the division
            int result = numerator / denominator;
            // Print the result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // This block catches the ArithmeticException if the denominator is zero
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            // This block catches the InputMismatchException if the user enters a non-numeric value
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            // This block is always executed, whether an exception occurs or not, to close the Scanner object
            scanner.close();
        }
    }
}
