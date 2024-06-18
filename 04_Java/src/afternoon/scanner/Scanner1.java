package afternoon.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // print는 끝나는 커서가 그 문장 맨 끝임.
        System.out.print("문자열을 입력하세요 :");
        // 입력한 것을 문자열로 받겠다.
        String str = scanner.nextLine();
        System.out.println("입력한 문자열은 !! : " + str);

        System.out.print("정수를 입력하세요 :");
        int number = scanner.nextInt();
        // 여기서 number는 숫자니까 자동으로 문자열로 변환 해줌.
        System.out.println("입력한 정수는 : " + number);

        System.out.print("실수를 입력하시오 :");
        double number2 = scanner.nextDouble();

        System.out.println("입력한 실수는 : " + number2);

    }
}
