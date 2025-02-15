package com.junittesting.filehandling;

import java.io.*;

public class FileProcessor {
    // Method to write content to a file
    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    // Method to read content from a file
    public String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    // Main method to run the FileProcessor class
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        String filename = "testfile.txt";
        String content = "Hello, this is a test file.";

        try {
            fileProcessor.writeToFile(filename, content);
            String readContent = fileProcessor.readFromFile(filename);
            System.out.println("Read content: " + readContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
