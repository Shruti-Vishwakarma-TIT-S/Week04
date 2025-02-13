package com.collections.list;

import java.util.*;

public class RemoveDuplicates {

    // Method to remove duplicates while preserving the original order
    public static List<Integer> removeDuplicates(List<Integer> list) {

        // Create a set to track seen elements
        Set<Integer> seen = new HashSet<>();

        // Create a new list to store unique elements
        List<Integer> uniqueList = new ArrayList<>();

        // Iterate through the original list
        for (Integer item : list) {

            // If the item has not been seen before
            if (seen.add(item)) {
                // Add it to the unique list
                uniqueList.add(item);
            }
        }
        // Return the list with unique elements
        return uniqueList;
    }

    public static void main(String[] args) {

        // Create a list with elements
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

        // Remove duplicates while preserving order
        List<Integer> uniqueList = removeDuplicates(list);

        // Print the list with unique elements
        System.out.println("List with unique elements: " + uniqueList);
    }
}

