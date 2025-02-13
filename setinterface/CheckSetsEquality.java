package com.collections.setinterface;

import java.util.*;

public class CheckSetsEquality {

    // Method to check if two sets are equal
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {

        // Check if both sets contain the same elements
        return set1.equals(set2);
    }

    public static void main(String[] args) {

        // Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        // Check if the sets are equal and print the result
        System.out.println("Are sets equal: " + areSetsEqual(set1, set2));
    }
}
