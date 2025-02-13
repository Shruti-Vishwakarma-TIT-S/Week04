package com.collections.list;

import java.util.*;

public class FindNthFromEnd {

    // Method to find the Nth element from the end of a LinkedList
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        // Create two pointers starting at the beginning of the list
        Iterator<T> forwardIterator = list.iterator();
        Iterator<T> resultIterator = list.iterator();

        // Advance the forwardIterator by n positions
        for (int i = 0; i < n; i++) {
            if (forwardIterator.hasNext()) {
                forwardIterator.next();
            } else {
                return null;
            }
        }
        // Move both iterators until the forwardIterator reaches the end
        while (forwardIterator.hasNext()) {
            forwardIterator.next();
            resultIterator.next();
        }
        // Return the element at the resultIterator's position
        return resultIterator.next();
    }

    public static void main(String[] args) {
        // Create a LinkedList with elements
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

        // Find the 2nd element from the end
        String nthFromEnd = findNthFromEnd(list, 2);

        // Print the Nth element from the end
        System.out.println("Nth element from the end: " + nthFromEnd);
    }
}
