package afternoon.extendss.superr;

public class Child extends Parent{
    public  String name = "자식 클래스";

    @Override
    public void hello() {
        System.out.println("자식 클래스 : 안녕하세요");
    }

    public void superCall() {
        System.out.println("자신의 이름을 가져와 봅시다 : " + this.name);
        // 부모의 필드에서의 name을 가져옴.
        System.out.println("부모의 이름을 가져와 봅시다 : " + super.name);

        this.hello();
        // 부모의 메서드에서의 hello를 가져옴.
        // 즉, super는 자식이 overridng을 한 상태에서도 부모의 것을 접근할 수 있음.
        super.hello();
    }
}
