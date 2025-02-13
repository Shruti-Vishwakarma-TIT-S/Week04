package com.collections.setinterface;

import java.util.*;

public class SetToSortedList {

    // Method to convert a set to a sorted list
    public static List<Integer> convertToSortedList(Set<Integer> set) {

        // Create a new list from the set
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(sortedList);

        // Return the sorted list
        return sortedList;
    }

    public static void main(String[] args) {

        // Create a HashSet with elements
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert the set to a sorted list and print the result
        System.out.println("Sorted List: " + convertToSortedList(hashSet));
    }
}
