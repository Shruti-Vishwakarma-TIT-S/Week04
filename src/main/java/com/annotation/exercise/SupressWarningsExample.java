package com.annotation.exercise;

import java.util.ArrayList;

// Class to demonstrate suppressing unchecked warnings
public class SupressWarningsExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create an ArrayList without using generics
        ArrayList list = new ArrayList();

        // Add elements of different types to the list
        list.add("Hello");
        list.add(123);

        // Print the list
        System.out.println(list);
    }
}
