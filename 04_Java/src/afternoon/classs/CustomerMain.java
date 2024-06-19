package afternoon.classs;

public class CustomerMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer("공연정",25,20000,false);
        customer1.printCustomerInfo();
        System.out.println("");

        Customer customer2 = new Customer();
        customer2.printCustomerInfo();
    }
}





