package com.junittesting.stringutility;

public class StringUtils {
    // Method to reverse a given string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Main method to run the StringUtils class
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        // Example usage of the StringUtils methods
        System.out.println("Reverse: " + stringUtils.reverse("hello"));
        System.out.println("Is Palindrome: " + stringUtils.isPalindrome("madam"));
        System.out.println("To Uppercase: " + stringUtils.toUpperCase("java"));
    }
}
