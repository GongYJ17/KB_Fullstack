package morning.ch07.sec04.exam01;

public class Computer extends  Calculator{

    @Override
    public double areaCircle(double r) {
        System.out.println("자식입니다!");
        return Math.PI * r * r;
    }
}
