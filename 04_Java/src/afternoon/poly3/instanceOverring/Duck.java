package afternoon.poly3.instanceOverring;

public class Duck extends Animal {

    @Override
    public void sound() {
        System.out.println("오리가 꽥꽥");
    }

    public void fly() {
        System.out.println("오리가 날다");
    }

}
