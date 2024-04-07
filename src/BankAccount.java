public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0.0; // Initialize balance to zero
    }

    // Deposit method
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Withdrawal method
    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    // Account summary
    public void accountSummary() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Balance: $" + balance);
    }
}