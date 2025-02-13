package com.collections.mapinterface;

import java.util.*;

public class InvertMap {

    // Method to invert a map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {

        // Create a new map to store the inverted result
        Map<V, List<K>> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {

            // Get the value and key from the original map
            V value = entry.getValue();
            K key = entry.getKey();

            // If the value is not already in the inverted map, add it with an empty list
            invertedMap.putIfAbsent(value, new ArrayList<>());

            // Add the key to the list corresponding to the value
            invertedMap.get(value).add(key);
        }
        return invertedMap;
    }

    public static void main(String[] args) {

        // Create a map with elements
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        // Invert the map and store the result
        Map<Integer, List<String>> invertedMap = invertMap(map);

        // Print the inverted map
        System.out.println("Inverted "+ invertedMap);
    }
}