package com.annotation.exercise;
// Class to represent a software component
public class SoftwareComponent {

    // Apply the repeatable annotation BugReport multiple times on the processInput method
    @BugReport(description = "NullPointerException when input is null")
    @BugReport(description = "ArrayIndexOutOfBoundsException for large indexes")
    public void processInput() {
        // Print a message when processInput is called
        System.out.println("Processing input...");
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of SoftwareComponent
        SoftwareComponent component = new SoftwareComponent();

        // Call the processInput method
        component.processInput();

        // Retrieve all BugReport annotations using reflection
        BugReport[] bugReports = component.getClass().getMethod("processInput").getAnnotationsByType(BugReport.class);

        // Print all bug report descriptions
        for (BugReport bugReport : bugReports) {
            System.out.println("Bug Report: " + bugReport.description());
        }
    }
}
