package com.collections.queue;

import java.util.*;

public class ReverseQueue {

    // Method to reverse a queue using queue operations
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {

        // Create a stack to hold elements temporarily
        Stack<Integer> stack = new Stack<>();

        // Remove all elements from the queue and push them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Pop elements from the stack and add them back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Return the reversed queue
        return queue;
    }

    public static void main(String[] args) {

        // Create a queue with elements
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));

        // Reverse the queue and print the result
        System.out.println("Reversed Queue: " + reverseQueue(queue));
    }
}
