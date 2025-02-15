package com.junittesting.userregistration;
public class UserRegistration {
    // Method to register a user
    public void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty() ||
                email == null || !email.contains("@") ||
                password == null || password.length() < 8) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Registration logic here (e.g., saving the user details)
        System.out.println("User registered successfully!");
    }

    // Main method to run the UserRegistration class
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        try {
            registration.registerUser("user123", "user@example.com", "password123");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
