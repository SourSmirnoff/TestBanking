public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount(double interestRate) {
        super(); // Call to superclass (BankAccount) constructor
        this.interestRate = interestRate;
    }

    // Overdraft withdrawal
    @Override
    public void withdrawal(double amount) {
        System.out.println("  ");
        System.out.println("Current Balance: $" + getBalance());
        System.out.println("Withdrawal started for $" + amount + ".");
        if (getBalance() - amount < 0) {
            super.withdrawal(amount + 30); // Include overdraft fee
            System.out.println("Overdraft! $30 fee has been applied.");
        } else {
            super.withdrawal(amount);
        }
    }

    // Display account including interest rate
    public void displayAccount() {
        super.accountSummary(); // Call to superclass method
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Setters and getters for interestRate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}