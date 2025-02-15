package com.exceptions.trywithresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            // Read the first line of the file
            String firstLine = reader.readLine();
            // Print the first line
            System.out.println("First line of the file: " + firstLine);
        } catch (IOException e) {
            // Handle any IOException that may occur and print an error message
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
