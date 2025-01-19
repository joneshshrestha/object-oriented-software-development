package com.joneshshrestha.bankingapp;

// public class CheckingAccount which is the child class of public class BankAccount
public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // constructor for the child class
    CheckingAccount(int accountNumber, String accountHolderName, double balance, AccountType accountType, double overdraftLimit) {
        // calls the constructor of the parent class and pass the variables to the parent class constructor
        super(accountNumber, accountHolderName, balance, accountType);
        // additional variable overdraftLimit as input
        this.overdraftLimit = overdraftLimit;
    }

    // method overriding for method withdraw of the parent class
    @Override
    public String withdraw(double amount) {
        // using getter method of the parent class to store and manipulate the balance as needed
        double balance = getBalance();
        // returns error message if you try to withdraw amount less than or equal to $0
        if (amount <= 0) {
            return "Invalid amount. Amount must be greater than $0 for withdrawal.";
        // returns insufficient funds if you try to withdraw amount that is greater than your balance plus over draft limit
        } else if (amount > (balance + overdraftLimit)) {
            return "Insufficient funds.";
        } else {
            // returns success message and new total balance if you withdraw amount less than your balance plus over draft limit
            balance -= amount;
            // updates the balance using the setter method of the parent class
            setBalance(balance);
            return String.format("Withdrawal Successful. Your new balance is $%.2f", balance);
        }
    }

    // public class displayOverdraftLimit that returns the over draft limit
    public String displayOverdraftLimit() {
        return String.format("Overdraft Limit: $%.2f", overdraftLimit);
    }
}
