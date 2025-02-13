package com.javastreams.filehandling;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        // Specify the source file path to be read
        String sourceFile = "C:\\Users\\HP\\OneDrive\\Attachments\\Week4Day3\\src\\main\\java\\com\\javastreams\\filehandling\\Story The Boy and the Starfish.txt";

        // Specify the destination file path where the content will be written
        String destinationFile = "Destination.txt";

        // Use try-with-resources to ensure FileInputStream and FileOutputStream are closed properly
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int content;
            // Read the content of the source file byte by byte
            while ((content = fis.read()) != -1) {
                // Write the content to the destination file byte by byte
                fos.write(content);
            }
            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            // Handle case where the source file is not found
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle any IOExceptions that may occur during file handling
            System.out.println("An error occurred during file handling: " + e.getMessage());
        }
    }
}
