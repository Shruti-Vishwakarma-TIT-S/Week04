package com.regex.basicregexproblems;

public class LicensePlateValidator {

    public static boolean isValidLicensePlate(String licensePlate) {
        // Regex pattern for a valid license plate: starts with two uppercase letters followed by four digits
        String regex = "^[A-Z]{2}\\d{4}$";
        return licensePlate.matches(regex);
    }

    public static void main(String[] args) {
        // Example license plates to test
        String[] licensePlates = {"AB1234", "A12345", "XY5678", "ZZ9999"};

        // Loop through each license plate and validate it
        for (String licensePlate : licensePlates) {
            // Check and print if the license plate is valid or invalid
            if (isValidLicensePlate(licensePlate)) {
                System.out.println(licensePlate + " → Valid");
            } else {
                System.out.println(licensePlate + " → Invalid");
            }
        }
    }
}
