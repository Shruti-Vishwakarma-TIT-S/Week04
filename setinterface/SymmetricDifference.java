package com.collections.setinterface;

import java.util.*;

public class SymmetricDifference {

    // Method to compute the symmetric difference of two sets
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        // Create a new set to store the symmetric difference
        Set<Integer> diffSet = new HashSet<>(set1);

        // Add elements from set2 to the set
        diffSet.addAll(set2);

        // Create a new set to store the intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        // Remove the intersection elements from the difference set
        diffSet.removeAll(intersectionSet);

        // Return the symmetric difference set
        return diffSet;
    }

    public static void main(String[] args) {

        // Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Compute the symmetric difference and print the result
        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
    }
}
