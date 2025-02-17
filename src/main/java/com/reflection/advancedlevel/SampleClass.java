package com.reflection.advancedlevel;

// Sample class with a method to be timed
public class SampleClass {
    public void performTask() {
        // Simulate some work by sleeping for a short duration
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}