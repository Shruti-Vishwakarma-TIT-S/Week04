package com.exceptions.throwvsthrows;

public class InterestCalculator {
    // Method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        // Throw an IllegalArgumentException if amount or rate is negative
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        // Calculate and return the interest
        return amount * rate * years / 100;
    }

    public static void main(String[] args) {
        try {
            // Define amount, rate, and years
            double amount = 1000.0;
            double rate = 5.0;
            int years = 10;

            // Call calculateInterest method and print the result
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated interest: " + interest);

        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException and display error message
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
