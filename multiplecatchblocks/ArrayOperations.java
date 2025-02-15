package com.exceptions.multiplecatchblocks;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the user

        try {
            // Accept an integer array from the user
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            // Read array elements from the user
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Accept an index number from the user
            System.out.print("Enter the index number to retrieve value: ");
            int index = scanner.nextInt();

            // Retrieve and print the value at the specified index
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the index is out of range
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            // Handle the case where the array is null
            System.out.println("Array is not initialized!");
        } finally {
            // Close the Scanner object to free up resources
            scanner.close();
        }
    }
}
