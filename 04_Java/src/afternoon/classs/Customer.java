package afternoon.classs;

public class Customer {
    String name;
    int age;
    int total ;
    boolean isBlack;

    Customer () {
        this.age = 20;
    };

    Customer (String name,  int age, int total, boolean isBlack) {
        this.name = name;
        this.age = age;
        this.total = total;
        this.isBlack = isBlack;
    }

    void printCustomerInfo () {
        System.out.println("고객의 성함은 : " + this.name);
        System.out.println("고객의 나이는 : " + this.age);
        System.out.println("고객의 총 사용 금액은 : " + this.total);
        System.out.println("고객의 블랙 여부는 ? : " + this.isBlack);
    }


}
