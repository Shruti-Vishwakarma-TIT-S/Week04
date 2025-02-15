package com.regex.basicregexproblems;

public class UsernameValidator {

    // This method checks if the given username is valid
    public static boolean isValidUsername(String username) {
        // Regex pattern for a valid username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {
        // Example usernames to test
        String[] usernames = {"user_123", "123user", "us", "valid_user", "anotherUser1"};

        for (String username : usernames) {
            // Check and print if the username is valid or invalid
            if (isValidUsername(username)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
