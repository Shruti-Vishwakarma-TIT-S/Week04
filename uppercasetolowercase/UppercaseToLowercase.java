package com.javastreams.uppercasetolowercase;

import java.io.*;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        // Path to the source file to be read
        String sourceFile = "C:\\Users\\HP\\OneDrive\\Attachments\\Week4Day3\\src\\main\\java\\com\\javastreams\\uppercasetolowercase\\Story The Magical Paintbrush.txt";

        // Path to the destination file to be written
        String destinationFile = "destinationText.txt";

        // Use try-with-resources to ensure resources are closed properly
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            // Read each line from the source file
            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase and write to the destination file
                writer.write(line.toLowerCase());
                writer.newLine(); // Add a newline character
            }
            System.out.println("File conversion completed successfully.");

        } catch (IOException e) {
            // Handle any IOExceptions that may occur
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
