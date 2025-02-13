package com.collections.list;
import java.util.*;

public class FrequencyCounter {

    // Method to count the frequency of each element in the list
    public static Map<String, Integer> countFrequency(List<String> list) {

        // Create a map to store frequency of each element
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterate through each element in the list
        for (String item : list) {

            // Update the count of each element in the map
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        // Return the frequency map
        return frequencyMap;
    }

    public static void main(String[] args) {
        // Create a list of strings
        List<String> itemList = Arrays.asList("apple", "banana", "apple", "orange");

        // Call the method to count frequency and store the result in a map
        Map<String, Integer> frequencyMap = countFrequency(itemList);

        // Print the frequency map
        System.out.println("Frequency of elements: " + frequencyMap);
    }
}
