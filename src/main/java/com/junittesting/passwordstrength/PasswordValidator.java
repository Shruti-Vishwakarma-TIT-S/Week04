package com.junittesting.passwordstrength;

public class PasswordValidator {
    // Method to validate password strength
    public boolean validate(String password) {
        if (password.length() < 8) return false;
        boolean hasUppercase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            if (Character.isDigit(c)) hasDigit = true;
        }
        return hasUppercase && hasDigit;
    }

    // Main method to run the PasswordValidator class
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        System.out.println("Password 'Password123' is valid: " + validator.validate("Password123"));
        System.out.println("Password 'password' is valid: " + validator.validate("password"));
    }
}
