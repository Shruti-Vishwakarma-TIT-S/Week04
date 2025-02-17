package com.reflection.basiclevel;

import java.lang.reflect.Method;

public class Calculator {
    private int multiply(int a, int b) {
        return a * b; // Private method
    }

    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            // Get the Class object
            Class<?> cls = calculator.getClass();

            // Access the private method 'multiply'
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true); // Make the method accessible

            // Invoke the private method
            int result = (int) method.invoke(calculator, 5, 4);
            System.out.println("Result of multiplication: " + result);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
