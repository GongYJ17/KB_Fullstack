package afternoon.access;

import afternoon.access.refactor2.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.deposit(100);
        account.getBalance();
        account.deposit(-200);
        account.withdraw(100);
        account.withdraw(-30);
        account.withdraw(100000000);
        account.getBalance();

    }
}
