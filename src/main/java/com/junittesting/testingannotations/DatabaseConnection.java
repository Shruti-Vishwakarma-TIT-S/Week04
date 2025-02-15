package com.junittesting.testingannotations;

public class DatabaseConnection {
    private boolean connected;

    // Method to connect to the database
    public void connect() {
        connected = true;
        System.out.println("Connected to the database.");
    }

    // Method to disconnect from the database
    public void disconnect() {
        connected = false;
        System.out.println("Disconnected from the database.");
    }

    // Method to check if the connection is established
    public boolean isConnected() {
        return connected;
    }

    // Main method to run the DatabaseConnection class
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        // Example usage of the DatabaseConnection methods
        dbConnection.connect();
        System.out.println("Is connected: " + dbConnection.isConnected());
        dbConnection.disconnect();
        System.out.println("Is connected: " + dbConnection.isConnected());
    }
}
