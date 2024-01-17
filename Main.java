public class Main {
    public static void main(String[] args) {
        BankAccount checking = new BankAccount(1000.00);
        SavingsAccount savings = new SavingsAccount(2000.00, 2.5);

        DepositTransaction deposit = new DepositTransaction();
        WithdrawalTransaction withdrawal = new WithdrawalTransaction();
        BankTransaction bankTransaction = new BankTransaction();

        // Perform transactions
        deposit.execute(checking, 200.00);
        withdrawal.execute(checking, 150.00);
        bankTransaction.executeTransaction(savings, 300.00); // Includes interest application

        // Print balances
        System.out.println("Checking Account Balance: " + checking.getBalance());
        System.out.println("Savings Account Balance: " + savings.getBalance());
    }
}