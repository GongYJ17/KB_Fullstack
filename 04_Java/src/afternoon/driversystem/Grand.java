package afternoon.driversystem;

public class Grand implements Car{
    @Override
    public void openDoor() {
        System.out.println(" Grand, 차 문을 엽니다");
    }

    @Override
    public void drive() {
        System.out.println("Grand 주행 시작");
        System.out.println("Grand 주행 종료");
    }
}
