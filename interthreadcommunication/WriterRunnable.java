package com.javastreams.interthreadcommunication;

import java.io.IOException;
import java.io.PipedOutputStream;

// Runnable class for writing data to the PipedOutputStream
class WriterRunnable implements Runnable {
    private PipedOutputStream pos;

    public WriterRunnable(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (PipedOutputStream out = pos) {
            for (int i = 1; i <= 10; i++) {
                String message = "Message " + i;
                out.write(message.getBytes());
                System.out.println("Written: " + message);
                Thread.sleep(500); // Simulate delay
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("WriterRunnable error: " + e.getMessage());
        }
    }
}
