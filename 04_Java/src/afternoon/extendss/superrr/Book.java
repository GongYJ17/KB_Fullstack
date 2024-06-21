package afternoon.extendss.superrr;

public class Book extends Item{
    private String author;
    private String title;

    Book (String name, int price, String author, String title) {
        super(name,price); // super.name = name 은 안됨. 부모의 name은 private이기 때문임.
        this.author = author;
        this.title = title;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("책의 저자는 : "+ this.author);
        System.out.println("책의 제목은 : "+ this.title);
    }


}
