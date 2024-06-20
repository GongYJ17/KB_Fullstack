package afternoon.access.refactor;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("농협은행","gold","공연정",20000);
        // public 접근
        System.out.println(account.bank);
        // default 접근
        System.out.println(account.grade);

//        System.out.println(account.name);
//        System.out.println(account.balance);

    }
}
