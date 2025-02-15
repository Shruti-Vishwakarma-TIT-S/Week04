package com.exceptions.banktransactionsystem;

// Custom exception class for insufficient balance
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
