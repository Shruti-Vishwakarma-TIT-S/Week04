package com.annotation.intermediatelevel;

import java.lang.reflect.Field;

public class User {

    // Apply the MaxLength annotation to the username field
    @MaxLength(10)
    private String username;

    // Constructor that validates the length of the username
    public User(String username) {
        // Validate the username length
        validateUsername(username);
        this.username = username;
    }

    // Method to validate the username length
    private void validateUsername(String username) {
        // Get the MaxLength annotation applied to the username field
        MaxLength maxLength = null;
        try {
            Field field = User.class.getDeclaredField("username");
            maxLength = field.getAnnotation(MaxLength.class);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        // Check if the length of the username exceeds the specified maximum length
        if (maxLength != null && username.length() > maxLength.value()) {
            throw new IllegalArgumentException("Username exceeds maximum length of " + maxLength.value());
        }
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        try {
            // Create a user with a valid username
            User user1 = new User("Alice");
            System.out.println("User created: " + user1.getUsername());

            // Create a user with an invalid username
            User user2 = new User("ThisUsernameIsTooLong");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
