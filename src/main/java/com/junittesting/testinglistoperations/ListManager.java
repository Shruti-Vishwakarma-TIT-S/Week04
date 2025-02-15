package com.junittesting.testinglistoperations;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
    // Method to add an element to a list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Method to remove an element from a list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    // Method to get the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }

    // Main method to run the ListManager class
    public static void main(String[] args) {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();

        // Example usage of the ListManager methods
        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        listManager.addElement(list, 3);

        System.out.println("List after adding elements: " + list);
        System.out.println("Size of list: " + listManager.getSize(list));

        listManager.removeElement(list, 2);

        System.out.println("List after removing element 2: " + list);
        System.out.println("Size of list: " + listManager.getSize(list));
    }
}
