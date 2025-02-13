package com.collections.list;

import java.util.*;

public class ListReversal {

    // Method to reverse an ArrayList
    public static List<Integer> reverseArrayList(List<Integer> list) {

        // Create a new list to store reversed elements
        List<Integer> reversedList = new ArrayList<>();

        // Iterate from the end of the original list to the beginning
        for (int i = list.size() - 1; i >= 0; i--) {
            // Add each element to the new list
            reversedList.add(list.get(i));
        }

        // Return the reversed list
        return reversedList;
    }

    // Method to reverse a LinkedList
    public static List<Integer> reverseLinkedList(List<Integer> list) {

        // Create a new LinkedList to store reversed elements
        LinkedList<Integer> reversedList = new LinkedList<>();

        // Iterate from the end of the original list to the beginning
        for (int i = list.size() - 1; i >= 0; i--) {
            // Add each element to the new list
            reversedList.add(list.get(i));
        }

        // Return the reversed list
        return reversedList;
    }

    public static void main(String[] args) {

        // Create an ArrayList with elements
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);

        // Create a LinkedList with the same elements
        List<Integer> linkedList = new LinkedList<>(arrayList);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + reverseArrayList(arrayList));

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));
    }
}
