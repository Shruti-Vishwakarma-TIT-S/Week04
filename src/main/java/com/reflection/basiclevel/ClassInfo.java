package com.reflection.basiclevel;

import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) {
        try {
            // Accept class name as input
            String className = "java.util.ArrayList"; // Replace with user input if needed

            // Get the Class object
            Class<?> cls = Class.forName(className);

            // Display class name
            System.out.println("Class Name: " + cls.getName());

            // Display methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            // Display fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }

            // Display constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.getName());
            }

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
