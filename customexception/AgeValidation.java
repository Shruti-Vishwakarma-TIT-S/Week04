package com.exceptions.customexception;

import java.util.Scanner;

public class AgeValidation {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw custom exception if age is below 18
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            // Print message if age is 18 or above
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the user
        try {
            // Prompt user to enter their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();  // Read the age from user input

            // Call validateAge method to check age
            validateAge(age);

        } catch (InvalidAgeException e) {
            // Handle the custom exception and display error message
            System.out.println(e.getMessage());
        } finally {
            // Close the Scanner object
            scanner.close();
        }
    }
}

