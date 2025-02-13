package com.javastreams.interthreadcommunication;

import java.io.*;

public class PipedStreamExample {
    public static void main(String[] args) {
        // Create a PipedOutputStream instance for writing data
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis;

        try {
            // Create a PipedInputStream instance for reading data, connected to the PipedOutputStream
            pis = new PipedInputStream(pos);

            // Create writer and reader threads
            Thread writerThread = new Thread(new WriterRunnable(pos), "WriterThread");
            Thread readerThread = new Thread(new ReaderRunnable(pis), "ReaderThread");

            // Start the writer and reader threads
            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            // Handle any IOExceptions that may occur
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

