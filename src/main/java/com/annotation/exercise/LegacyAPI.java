package com.annotation.exercise;

// Create a class named LegacyAPI
public class LegacyAPI {

    // Use @Deprecated to mark oldFeature as deprecated
    @Deprecated
    public void oldFeature() {
        // Print a message when oldFeature is called
        System.out.println("This is the old feature");
    }

    // Define a new method named newFeature
    public void newFeature() {
        // Print a message when newFeature is called
        System.out.println("This is the new feature");
    }

    public static void main(String[] args) {
        // Create an instance of LegacyAPI
        LegacyAPI api = new LegacyAPI();

        // Call the oldFeature method (marked as deprecated)
        api.oldFeature();

        // Call the newFeature method
        api.newFeature();
    }
}
