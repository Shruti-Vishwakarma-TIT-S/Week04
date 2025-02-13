package com.collections.queue;

import java.util.*;

public class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;

    // Constructor to initialize the buffer
    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Add an element to the buffer
    public void add(int element) {
        buffer[tail] = element;
        tail = (tail + 1) % buffer.length;
        if (size < buffer.length) {
            size++;
        } else {
            head = (head + 1) % buffer.length;
        }
    }

    // Get the elements in the buffer as a list
    public List<Integer> getBufferElements() {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            elements.add(buffer[(head + i) % buffer.length]);
        }
        return elements;
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        // Add elements to the buffer
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        System.out.println("Buffer: " + buffer.getBufferElements());

        // Add another element, overwriting the oldest element
        buffer.add(4);
        System.out.println("Buffer: " + buffer.getBufferElements());
    }
}
