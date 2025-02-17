package com.reflection.advancedlevel;

import java.lang.reflect.Field;

public class DependencyInjector {

    // Method to perform dependency injection
    public static void injectDependencies(Object obj) {
        Class<?> clazz = obj.getClass();

        // Iterate through all fields of the class
        for (Field field : clazz.getDeclaredFields()) {
            // Check if the field is annotated with @Inject
            if (field.isAnnotationPresent(Inject.class)) {
                // Make the field accessible
                field.setAccessible(true);

                try {
                    // Create a new instance of the field type and set it
                    Object fieldInstance = field.getType().getDeclaredConstructor().newInstance();
                    field.set(obj, fieldInstance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a client instance
        Client client = new Client();

        // Perform dependency injection
        injectDependencies(client);

        // Call a method on the client to demonstrate that the dependency was injected
        client.doWork();
    }
}
