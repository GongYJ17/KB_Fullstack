package afternoon.access.refactor2;

import afternoon.access.refactor.AccountRefactor;

public class AccountRefactorOuter {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("우리은행","bronze","공연정",30000);
        // public 접근
        System.out.println(account.bank);
        // default 접근
//        System.out.println(account.grade);
//        // private 접근
//        System.out.println(account.name);
//        System.out.println(account.balance);
    }
}
