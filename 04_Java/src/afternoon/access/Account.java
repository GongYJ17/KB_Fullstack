package afternoon.access;

import java.util.AbstractCollection;

public class Account {
    int balance = 0;

    Account(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }
}
