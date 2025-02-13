package com.collections.queue;

import java.util.*;

public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto the stack
    public void push(int x) {
        q1.add(x);
    }

    // Pop element from the stack
    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int poppedElement = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    // Get the top element of the stack
    public int top() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int topElement = q1.remove();
        q2.add(topElement);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop an element from the stack
        System.out.println("Popped element: " + stack.pop());

        // Get the top element of the stack
        System.out.println("Top element: " + stack.top());
    }
}
