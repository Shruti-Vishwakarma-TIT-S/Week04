package com.collections.mapinterface;
import java.util.*;

public class FindMaxKey {

    // Method to find the key with the maximum value
    public static String findKeyWithMaxValue(Map<String, Integer> map) {

        // Initialize variables to keep track of the max value and corresponding key
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Iterate through the map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            // Update maxKey and maxValue if the current value is greater
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        // Return the key with the maximum value
        return maxKey;
    }

    public static void main(String[] args) {

        // Create a map with elements
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Find the key with the maximum value and print the result
        System.out.println("Key with maximum value: " + findKeyWithMaxValue(map));
    }
}
