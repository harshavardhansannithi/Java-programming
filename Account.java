public class Account {
    private double balance;

    // Default constructor
    public Account() {
        balance = 0.0;
    }

    // Constructor with initial balance
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Function to add money to the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Function to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Function to inquire the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create an account with initial balance of 10,000
        Account account = new Account(10000);

        // Deposit 500 into the account
        account.deposit(500);

        // Withdraw 200 from the account
        account.withdraw(200);

        // Inquire the current balance
        double currentBalance = account.getBalance();
        System.out.println("Current balance: " + currentBalance);
    }
}