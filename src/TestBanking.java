public class TestBanking {
    public static void main(String[] args) {
        // Create a CheckingAccount object with interest rate
        CheckingAccount myAccount = new CheckingAccount(1.5);
        myAccount.setFirstName("Random");
        myAccount.setLastName("Person");
        myAccount.setAccountID(123456);

        // Demonstrate deposit
        myAccount.deposit(1000);
        myAccount.displayAccount();

        // Demonstrate withdrawal without overdraft
        myAccount.withdrawal(500);
        myAccount.displayAccount();

        // Demonstrate withdrawal with overdraft
        myAccount.withdrawal(600); // This should trigger overdraft
        myAccount.displayAccount();
    }
}