package com.javastreams.countwordsinfile;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        // Specify the file path to the text file
        String filePath = "C:\\Users\\HP\\OneDrive\\Attachments\\Week4Day3\\src\\main\\java\\com\\javastreams\\bufferedstreams\\Story The Boy and the Starfish.txt";

        // Use HashMap to count word occurrences
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Use try-with-resources to ensure BufferedReader is closed properly
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Split each line into words using non-word characters as delimiters
                String[] words = line.toLowerCase().split("\\W+");
                // Count the occurrences of each word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            // Handle any IOExceptions that may occur while reading the file
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Sort words by frequency and display the top 5
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
        sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Top 5 most frequently occurring words:");
        // Display the top 5 most frequently occurring words
        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
