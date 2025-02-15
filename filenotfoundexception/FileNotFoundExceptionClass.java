package com.exceptions.filenotfoundexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionClass {
    public static void main(String[] args) {
        // Create a File object to represent the file we want to read
        try {
            File file = new File("abc.txt");

            // Create a Scanner object to read the contents of the file
            Scanner scanner = new Scanner(file);

            // Iterate over each line of the file and print it to the console
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the Scanner object to free up resources
            scanner.close();

        } catch (FileNotFoundException e) {
            // This block catches the FileNotFoundException if the file is not found
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
