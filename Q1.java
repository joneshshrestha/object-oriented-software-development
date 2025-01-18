public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private AccountType accountType;

    // creating enum type AccountType
    enum AccountType {
        SAVINGS, CHECKING;
    }

    // constructor to initialize the corresponding instance variable
    AccountType(int accountNumber, String accountHolderName, double balance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.AccountType = accountType;
    }

    public double deposit(double amount) {
        balance += amount
        return String.format("Deposit Successful. Your new balance is $%.2f", balance);
    }

    public String withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            return String.format("Withdrawal Successful. Your new balance is $%.2f", balance);
        } else if (amount > balance) {
            return "Insufficient balance";
        }
    }

    public String getAccountInfo() {

        return String.format("Account Number: %d, Account Holder: %s, Account Type: %s, Balance: $%.2f", accountNumber, accountHolderName, accountType, balance)
    }
}

BankAccount account = new BankAccount(12345, '')