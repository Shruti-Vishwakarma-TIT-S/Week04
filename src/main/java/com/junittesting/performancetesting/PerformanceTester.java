package com.junittesting.performancetesting;

public class PerformanceTester {
    // Method that simulates a long-running task by sleeping for 3 seconds
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            // Re-throw as unchecked exception to handle interruption
            throw new RuntimeException("Task interrupted", e);
        }
        return "Task Completed";
    }

    // Main method to run the PerformanceTester class
    public static void main(String[] args) {
        PerformanceTester tester = new PerformanceTester();
        System.out.println(tester.longRunningTask());
    }
}
