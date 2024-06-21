package afternoon.extendss.access.child;

import afternoon.extendss.access.parents.Parent;

public class Child extends Parent {
    public void access() {

        protectedMethod();

        printParent();

        System.out.println("publicValue : " + publicValue); // 어디서든 접근 가능
        System.out.println("protectedValue : " + protectedValue); // 패키지 다르지만 상속관계라 가능
//        System.out.println("defaultValue : " + defaultValue); // 패키지가 달라서 불가능
//        System.out.println("privateValue : " + privateValue ); // 같은 클래스가 아니라서 불가능

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();
    }

}
