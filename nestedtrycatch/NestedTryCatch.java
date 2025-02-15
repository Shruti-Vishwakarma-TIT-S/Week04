package com.exceptions.nestedtrycatch;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept an array of integers from the user
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Accept an index and a divisor from the user
            System.out.print("Enter the index of the element to be accessed: ");
            int index = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            try {
                // Try to access the element at the specified index
                int element = array[index];

                try {
                    // Try to divide the element by the divisor
                    int result = element / divisor;
                    System.out.println("Division result: " + result);
                } catch (ArithmeticException e) {
                    // Handle ArithmeticException (division by zero)
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle ArrayIndexOutOfBoundsException (invalid index)
                System.out.println("Invalid array index!");
            }
        } finally {
            scanner.close();  // Close the scanner
        }
    }
}
