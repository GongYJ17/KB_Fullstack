package afternoon.poly4;

public class GongMain2 {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Gong()};


        for (int i = 0; i < animals.length; i++) {
            animalDo(animals[i]);

            if (animals[i] instanceof Human) {
                humanDo((Human) animals[i]);
            }

        }

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
