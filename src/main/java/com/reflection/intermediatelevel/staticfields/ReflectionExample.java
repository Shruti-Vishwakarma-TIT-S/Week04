package com.reflection.intermediatelevel.staticfields;

import java.lang.reflect.Field;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Use the fully qualified name of the Configuration class
            Class<?> configClass = Class.forName("com.reflection.intermediatelevel.staticfields.Configuration");

            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true); // Access the private field

            // Print the original value
            System.out.println("Original API_KEY: " + Configuration.getApiKey());

            // Modify the value
            apiKeyField.set(null, "new_api_key");

            // Print the modified value
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
