package com.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNValidator {

    /**
     * This method checks if the given SSN is valid.
     * @param ssn The Social Security Number to be validated.
     * @return true if the SSN is valid, false otherwise.
     */
    public static boolean isValidSSN(String ssn) {
        // Regex pattern for a valid SSN
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }

    public static void main(String[] args) {
        // Example SSNs to test
        String[] ssns = {"123-45-6789", "123456789", "987-65-4321"};

        // Loop through each SSN and validate it
        for (String ssn : ssns) {
            // Check and print if the SSN is valid or invalid
            if (isValidSSN(ssn)) {
                System.out.println(ssn + " → Valid");
            } else {
                System.out.println(ssn + " → Invalid");
            }
        }
    }
}
