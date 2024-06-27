package afternoon.poly4;

public class Gong implements Animal, Human{
    @Override
    public void eat() {
        System.out.println("연정 밥을 먹습니다. 넘 배불러");
    }

    @Override
    public void sleep() {
        System.out.println("연정 잠을 잡니다. 쿨쿨");
    }

    @Override
    public void think() {
        System.out.println("연정 생각합니다. 곰곰");
    }
}
