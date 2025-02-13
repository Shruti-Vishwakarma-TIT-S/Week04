package com.javastreams.interthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;

// Runnable class for reading data from the PipedInputStream
class ReaderRunnable implements Runnable {
    private PipedInputStream pis;

    public ReaderRunnable(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try (PipedInputStream in = pis) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                String message = new String(buffer, 0, bytesRead);
                System.out.println("Read: " + message);
            }
        } catch (IOException e) {
            System.out.println("ReaderRunnable error: " + e.getMessage());
        }
    }
}
