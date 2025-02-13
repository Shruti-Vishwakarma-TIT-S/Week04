package com.javastreams.readfilelinebyline;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        // Specify the file path to the large text file
        String filePath = "C:\\Users\\HP\\OneDrive\\Attachments\\Week4Day3\\src\\main\\java\\com\\javastreams\\readfilelinebyline\\Story The Magical Paintbrush.txt";

        // Use try-with-resources to ensure BufferedReader is closed properly
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Check if the line contains the word "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    // Print the line containing "error"
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            // Handle any IOExceptions that may occur while reading the file
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
