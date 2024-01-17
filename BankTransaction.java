public class BankTransaction {
    public void executeTransaction(BankAccount account, double amount) {
        account.deposit(amount);
    }

    // This method is an example of method overloading for polymorphism
    public void executeTransaction(SavingsAccount account, double amount) {
        account.deposit(amount);
        account.applyInterest();
    }
}