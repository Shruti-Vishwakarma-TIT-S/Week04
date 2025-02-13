package com.collections.setinterface;

import java.util.*;

public class UnionAndIntersection {

    // Method to compute the union of two sets
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {

        // Create a new set to store the union
        Set<Integer> unionSet = new HashSet<>(set1);

        // Add all elements of set2 to the union set
        unionSet.addAll(set2);

        // Return the union set
        return unionSet;
    }

    // Method to compute the intersection of two sets
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {

        // Create a new set to store the intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);

        // Retain only the elements that are present in set2
        intersectionSet.retainAll(set2);

        // Return the intersection set
        return intersectionSet;
    }

    public static void main(String[] args) {

        // Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Compute the union and intersection of the sets and print the results
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
    }
}
