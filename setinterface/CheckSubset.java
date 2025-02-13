package com.collections.setinterface;

import java.util.*;

public class CheckSubset {

    // Method to check if one set is a subset of another
    public static boolean isSubset(Set<Integer> subset, Set<Integer> superset) {

        // Check if superset contains all elements of subset
        return superset.containsAll(subset);
    }

    public static void main(String[] args) {

        // Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Check if set1 is a subset of set2 and print the result
        System.out.println("Is subset: " + isSubset(set1, set2));
    }
}
