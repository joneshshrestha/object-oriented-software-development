package com.joneshshrestha.bankingapp;

public class BankAccount {
    // private access modifier for the instance variables such that they cannot be directly accessed by outside classes
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private AccountType accountType;

    // creating enum type AccountType to represent the type of the bank account
    enum AccountType {
        SAVINGS, CHECKING;
    }

    // constructor to initialize the corresponding instance variable (account details)
    BankAccount(int accountNumber, String accountHolderName, double balance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // getter method for private variable balance to be accessed inside the child class CheckingAccount
    public double getBalance() {
        return balance;
    }

    // setter method for private variable balance to return updated balance from the child class CheckingAccount
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // public method deposit takes in amount of type double as parameter
    public String deposit(double amount) {
        // returns invalid if you try to deposit negative or $0 balance
        if (amount <= 0) {
            return "Invalid amount. Amount must be greater than $0 for deposit.";
        } else {
            // returns the final balance if the amount you are trying to deposit is greater than $0
            balance += amount;
            return String.format("Deposit Successful. Your new balance is $%.2f", balance);
        }
    }

    // public method that takes in amount of type double as parameter
    public String withdraw(double amount) {
        // returns error message if you try to withdraw amount less than or equal to $0
        if (amount <= 0) {
            return "You need to withdraw at least amount greater than $0";
        // returns insufficient balance if you try to withdraw amount that is greater than your total balance
        } else if (amount > balance) {
            return "Insufficient balance";
        } else {
            // returns success message and new total balance if you withdraw amount less than your balance
            balance -= amount;
            return String.format("Withdrawal Successful. Your new balance is $%.2f", balance);
        }
    }

    // public method to get your account information
    public String getAccountInfo() {
        return String.format("Account Number: %d, Account Holder: %s, Account Type: %s, Balance: $%.2f", accountNumber, accountHolderName, accountType, balance);
    }

    // public method that takes in transfer amount and destination account
    public String transfer(double amount, BankAccount destinationAccount) {
        // returns error message if you try to transfer amount less than or equal to $0
        if (amount <= 0) {
            return "Amount must be greater than $0 for transfer.";
        // returns insufficient balance if you try to transfer amount that is greater than your total balance
        } else if (amount > balance) {
            return "Insufficient balance.";
        } else {
            // returns success message and new total balance if you transfer amount less than your balance
            balance -= amount;
            destinationAccount.balance += amount;
            return String.format("Transfer Successful. Your new balance is $%.2f", balance);
        }
    }
}



