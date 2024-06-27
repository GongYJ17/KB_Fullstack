package afternoon.driversystem;

import java.util.Scanner;

public class Driver {
    private Car car;
    Scanner sc = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    };

    public void selectCar() {
        System.out.println("차 종류선택 (1.K5 / 2. 그랜저 / 3.G70): ");
        int option = sc.nextInt();
        findCar(option);
    };

    public void drive() {}
        car.drive();
}
