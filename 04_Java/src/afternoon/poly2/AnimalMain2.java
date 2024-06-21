package afternoon.poly2;

public class AnimalMain2 {
    public static void main(String[] args) {
        // Animal은 부모로서 4 동물의 타입을 포함한다.
        Animal[] animals = { new Donkey(), new Dog(), new Cat(), new Chicken()};

        // v-for와 비슷함.
        //   부모타입  변수    // 배열
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // 메서드는 고정인데 받는 동물들이 달라질 것임.
    // 매개변수로 부모 Animal animal에는
    // Donkey donkey 가 자동타입변환이 적용됨.
    private static void soundAnimal (Animal animal) {
        // 메서드는 하나임. 기능이 다르게 나옴 -> 다형성
        animal.sound();
    }
}
