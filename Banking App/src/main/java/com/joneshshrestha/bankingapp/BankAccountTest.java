package com.joneshshrestha.bankingapp;

// public class which contains the main method
public class BankAccountTest {
    // main method which is the entry point of this java program
    public static void main (String[] args) {
        // create a new object from the public class CheckingAccount that creates a new account with the following information
        CheckingAccount account1 = new CheckingAccount(12345, "John Doe", 1000, CheckingAccount.AccountType.CHECKING, 1000);
        // create a new object from the public class BankAccount that creates a new account with the following information
        BankAccount account2 = new BankAccount(23456, "John Cena", 3000, BankAccount.AccountType.SAVINGS);
        // calling deposit, withdraw, displayOverdraftLimit and getAccountInfo method and testing which prints on the console
        System.out.println(account1.deposit(500));
        System.out.println(account1.withdraw(300));
        System.out.println(account1.transfer(1000, account2));

        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());
        System.out.println(account1.displayOverdraftLimit());
        System.out.println(account1.withdraw(1200));
        System.out.println(account1.withdraw(100));
    }
}

