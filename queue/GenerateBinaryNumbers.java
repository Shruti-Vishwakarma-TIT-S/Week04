package com.collections.queue;

import java.util.*;

public class GenerateBinaryNumbers {

    // Method to generate the first N binary numbers using a queue
    public static List<String> generateBinaryNumbers(int N) {

        // Create a list to store binary numbers
        List<String> binaryNumbers = new ArrayList<>();

        // Create a queue to help generate binary numbers
        Queue<String> queue = new LinkedList<>();

        // Add the first binary number to the queue
        queue.add("1");

        // Generate N binary numbers
        for (int i = 0; i < N; i++) {

            // Remove the front element from the queue and add it to the list
            String current = queue.remove();
            binaryNumbers.add(current);

            // Add the next two binary numbers to the queue
            queue.add(current + "0");
            queue.add(current + "1");
        }

        // Return the list of binary numbers
        return binaryNumbers;
    }

    public static void main(String[] args) {

        // Generate and print the first 5 binary numbers
        System.out.println("First 5 binary numbers: " + generateBinaryNumbers(5));
    }
}
