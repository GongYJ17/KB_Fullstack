//Duck
package afternoon.poly4.ex1;

public class Duck implements Animal,Fly {

    @Override
    public void eat() {
        System.out.println("오리가 밥을 먹어요");
    }

    @Override
    public void sound() {
        System.out.println("오리꾸액!");
    }

    @Override
    public void fly() {
        System.out.println("오리날다!!");
    }
}
