package com.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardValidator {

    /**
     * This method checks if the given credit card number is valid.
     * @param cardNumber The credit card number to be validated.
     * @return true if the card number is valid, false otherwise.
     */
    public static boolean isValidCreditCard(String cardNumber) {
        // Regex pattern for a valid Visa or MasterCard number
        String visaRegex = "^4\\d{15}$";
        String masterCardRegex = "^5\\d{15}$";
        return cardNumber.matches(visaRegex) || cardNumber.matches(masterCardRegex);
    }

    public static void main(String[] args) {
        // Example credit card numbers to test
        String[] cardNumbers = {"4111111111111111", "5111111111111111", "6111111111111111", "411111111111111"};

        // Loop through each credit card number and validate it
        for (String cardNumber : cardNumbers) {
            // Check and print if the card number is valid or invalid
            if (isValidCreditCard(cardNumber)) {
                System.out.println(cardNumber + " → Valid");
            } else {
                System.out.println(cardNumber + " → Invalid");
            }
        }
    }
}
