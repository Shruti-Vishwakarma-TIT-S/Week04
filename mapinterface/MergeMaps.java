package com.collections.mapinterface;

import java.util.*;

public class MergeMaps {

    // Method to merge two maps and sum values of common keys
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {

        // Create a new map to store the merged result
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Iterate through the second map's entries
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            // Sum the values of common keys and put them in the merged map
            mergedMap.put(entry.getKey(), mergedMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        // Return the merged map
        return mergedMap;
    }

    public static void main(String[] args) {

        // Create two maps with elements
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge the maps and print the result
        System.out.println("Merged Map: " + mergeMaps(map1, map2));
    }
}
