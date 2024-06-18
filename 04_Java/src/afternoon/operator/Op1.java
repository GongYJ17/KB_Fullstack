package afternoon.operator;

public class Op1 {
    public static void main(String[] args) {
        //문자연산의 특이점1

        int a = 3;
        int b = 2;
        System.out.println(a/b);
        String str = "a + b = ";
        int c = 10;
        System.out.println(str + c);

        //문자연산의 특이점2
        int d = 10;
        char e = 'e';
        // char를 숫자와 더할 때는 아스키 코드가 적용된다.
        System.out.println(d+e);

    }
}
