package afternoon.poly4;

public class GongMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Gong gong = new Gong();
        animalDo(dog);
        animalDo(gong);
        humanDo(gong);

    }

    public static void animalDo(Animal animal) {
        System.out.println("동물기능 테스트 시작!");
        animal.eat();
        animal.sleep();
        System.out.println("동물 기능 테스트 종료");
    }

    public static void humanDo(Human human) {
        System.out.println("사람 기능 테스트 시작!");
        human.think();
        System.out.println("사람 기능 테스트 종료!");
    }

}
