// Cat
package afternoon.poly4.ex1;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("냥냥이가 밥을 먹어요");
    }

    @Override
    public void sound() {
        System.out.println("고양이 야옹야옹");
    }
}
