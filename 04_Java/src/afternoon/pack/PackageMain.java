//PackageMain
package afternoon.pack;
//import afternoon.pack.nouveau.Customer;

import afternoon.pack.a.Boss;

public class PackageMain {
    public static void main(String[] args) {
//        Customer customer1 = new Customer();
//        afternoon.pack.nouveau.Customer customer2 = new afternoon.pack.nouveau.Customer();
//        System.out.println(customer1);
//        System.out.println(customer2);

        Boss boss = new Boss("공연정",20);
        boss.printBoss();

    }
}
