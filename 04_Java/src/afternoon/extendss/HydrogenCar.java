package afternoon.extendss;

public class HydrogenCar extends Car {


    @Override
    public void move() {
        System.out.println("수소차를 이동 합니다.");
    }

    @Override
    public void openDoor() {
        System.out.println("수소차 문을 엽니다!");
    }

    public void fillHydrogen () {
        System.out.println("수소를 충전합니다");
    }
}
