package com.collections.accountsystem;

import java.util.*;

public class BankingSystem {

    // Using HashMap to store customer accounts (AccountNumber -> Balance)
    private Map<String, Account> accountsMap = new HashMap<>();

    // Using TreeMap to sort customers by balance
    private TreeMap<Double, Account> balanceTreeMap = new TreeMap<>();

    // Using Queue to process withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Class to represent a withdrawal request
    static class WithdrawalRequest {
        String accountNumber;
        double amount;

        // Constructor
        public WithdrawalRequest(String accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    // Method to create a new account
    public void createAccount(String accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        accountsMap.put(accountNumber, account);
        balanceTreeMap.put(initialBalance, account);
    }

    // Method to get account by account number
    public Account getAccount(String accountNumber) {
        return accountsMap.get(accountNumber);
    }

    // Method to process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            Account account = accountsMap.get(request.accountNumber);
            if (account != null && account.getBalance() >= request.amount) {
                // Update account balance
                balanceTreeMap.remove(account.getBalance());
                account.setBalance(account.getBalance() - request.amount);
                balanceTreeMap.put(account.getBalance(), account);
                System.out.println("Withdrawal of Rs" + request.amount + " processed for account " + request.accountNumber);
            } else {
                System.out.println("Withdrawal request of Rs" + request.amount + " for account " + request.accountNumber + " could not be processed.");
            }
        }
    }

    // Method to add a withdrawal request to the queue
    public void addWithdrawalRequest(String accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    // Method to display all accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        System.out.println("Accounts Sorted by Balance:");
        for (Map.Entry<Double, Account> entry : balanceTreeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Create sample accounts
        bankingSystem.createAccount("A001", 1000);
        bankingSystem.createAccount("A002", 500);
        bankingSystem.createAccount("A003", 1500);

        // Display accounts sorted by balance
        bankingSystem.displayAccountsSortedByBalance();

        // Add withdrawal requests
        bankingSystem.addWithdrawalRequest("A001", 200);
        bankingSystem.addWithdrawalRequest("A002", 600); // This should fail

        // Process withdrawal requests
        bankingSystem.processWithdrawals();

        // Display accounts sorted by balance after withdrawals
        bankingSystem.displayAccountsSortedByBalance();
    }
}

