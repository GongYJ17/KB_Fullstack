package afternoon.poly2;

public class AnimalMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();


        soundAnimal(donkey);
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(chicken);
    }

    // 메서드는 고정인데 받는 동물들이 달라질 것임.
    // 매개변수로 부모 Animal animal에는
    // Donkey donkey 가 자동타입변환이 적용됨.
    private static void soundAnimal (Animal animal) {
        // 메서드는 하나임. 기능이 다르게 나옴 -> 다형성
        animal.sound();
    }
}
