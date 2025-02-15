package com.exceptions.banktransactionsystem;


public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);  // Create a bank account with an initial balance

        try {
            // Try to withdraw money
            account.withdraw(200.0);
            account.withdraw(900.0);  // This will throw InsufficientBalanceException
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            // Handle exceptions and print the error message
            System.out.println(e.getMessage());
        }
    }
}
