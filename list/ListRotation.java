package com.collections.list;

import java.util.*;

public class ListRotation {

    // Method to rotate a list by a given number of positions
    public static List<Integer> rotateList(List<Integer> list, int positions) {

        // Create a new list to store rotated elements
        List<Integer> rotatedList = new ArrayList<>();

        // Calculate the starting index after rotation
        int start = positions % list.size();

        // Add elements from the starting index to the end of the original list
        rotatedList.addAll(list.subList(start, list.size()));

        // Add the remaining elements from the beginning to the starting index
        rotatedList.addAll(list.subList(0, start));

        // Return the rotated list
        return rotatedList;
    }

    public static void main(String[] args) {

        // Create a list with elements
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        // Rotate the list by 2 positions
        List<Integer> rotatedList = rotateList(list, 2);

        // Print the rotated list
        System.out.println("Rotated List: " + rotatedList);
    }
}
