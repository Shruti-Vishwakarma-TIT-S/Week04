package com.annotation.intermediatelevel;

import java.lang.reflect.Method;

// Class to demonstrate logging method execution time
public class ExecutionTimeLogger {

    @LogExecutionTime
    public void method1() throws InterruptedException {
        // Simulate some work with sleep
        Thread.sleep(200);
        System.out.println("Executing method1");
    }

    @LogExecutionTime
    public void method2() throws InterruptedException {
        // Simulate some work with sleep
        Thread.sleep(100);
        System.out.println("Executing method2");
    }

    // Method to invoke methods annotated with LogExecutionTime and log execution time
    public void logExecutionTimes() throws Exception {
        for (Method method : this.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(this);
                long endTime = System.nanoTime();
                System.out.println("Execution time of " + method.getName() + ": " + (endTime - startTime) + " ns");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of ExecutionTimeLogger
        ExecutionTimeLogger logger = new ExecutionTimeLogger();

        // Log execution times of annotated methods
        logger.logExecutionTimes();
    }
}
