package afternoon.memory;

public class Counter {
    public static int counter = 0;

    Counter() {
        //this를 쓸필요가 없는 이유는 여기서 couter는 static으로 고유한 애가 됐으니까
        // 굳이 중복으로 헷갈릴 일이 없는 이 경우는 this 사용안함.
        // 원래라면 하나의 클래스로 여러개의 인스턴스를 만들 수 있으니까
        // 인스턴스 마다 변수가 존재하게 되고 서로 이름이 같아서 헷갈릴 수도 있음. 이 방지를 위해!!
        counter++;
    }

}
