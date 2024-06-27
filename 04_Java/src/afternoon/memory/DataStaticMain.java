package afternoon.memory;

public class DataStaticMain {
    public static void main(String[] args) {
        // 인스턴스화 해서 부르지 않아도 그 static으로 설정된 변수와 함수시행 가능함.
        System.out.println(DataStatic.value);
        DataStatic.showValue();
    }
}
