package com.reflection.advancedlevel;

import java.lang.reflect.Method;

public class MethodTiming {

    // Method to measure and log the execution time of a method
    public static void measureExecutionTime(Object obj, String methodName, Class<?>... parameterTypes) {
        try {
            // Get the method from the class
            Method method = obj.getClass().getMethod(methodName, parameterTypes);

            // Get the current time in milliseconds before execution
            long startTime = System.currentTimeMillis();

            // Invoke the method
            method.invoke(obj);

            // Get the current time in milliseconds after execution
            long endTime = System.currentTimeMillis();

            // Calculate and log the execution time
            System.out.println("Execution time of " + methodName + ": " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create an instance of the class containing the method to be measured
        SampleClass sample = new SampleClass();

        // Measure the execution time of the method
        measureExecutionTime(sample, "performTask");
    }
}


