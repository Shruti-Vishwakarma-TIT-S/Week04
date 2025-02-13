package com.javastreams.bufferedstreams;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        // Specify the source file path to be read
        String sourceFile = "C:\\Users\\HP\\OneDrive\\Attachments\\Week4Day3\\src\\main\\java\\com\\javastreams\\bufferedstreams\\Story The Boy and the Starfish.txt";

        // Specify the destination file path where the content will be written
        String destinationFile = "destinationLargeFile.txt";

        long startTime, endTime;

        // Measure time taken to copy file using unbuffered streams
        startTime = System.nanoTime();
        copyFileUsingUnbufferedStreams(sourceFile, destinationFile);
        endTime = System.nanoTime();
        System.out.println("Time taken using unbuffered streams: " + (endTime - startTime) + " ns");

        // Measure time taken to copy file using buffered streams
        startTime = System.nanoTime();
        copyFileUsingBufferedStreams(sourceFile, destinationFile);
        endTime = System.nanoTime();
        System.out.println("Time taken using buffered streams: " + (endTime - startTime) + " ns");
    }

    // Method to copy file using unbuffered streams
    private static void copyFileUsingUnbufferedStreams(String source, String destination) {
        // Use try-with-resources to ensure FileInputStream and FileOutputStream are closed properly
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            // Read the content of the source file in chunks and write to the destination file
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            // Handle any IOExceptions that may occur during file handling
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to copy file using buffered streams
    private static void copyFileUsingBufferedStreams(String source, String destination) {
        // Use try-with-resources to ensure BufferedInputStream and BufferedOutputStream are closed properly
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096]; // Buffer to hold chunks of data
            int bytesRead;
            // Read the content of the source file in chunks and write to the destination file
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            // Handle any IOExceptions that may occur during file handling
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
