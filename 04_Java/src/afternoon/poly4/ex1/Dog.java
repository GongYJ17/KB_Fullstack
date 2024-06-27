package afternoon.poly4.ex1;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("강아지가 밥을 먹어요");
    }

    @Override
    public void sound() {
        System.out.println("강아지 멍멍!");
    }
}
