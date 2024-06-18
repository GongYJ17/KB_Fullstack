package afternoon.scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randNum = (int) (Math.random() * 100) ;
        while (true) {

            System.out.print("랜덤 숫자를 입력하세요. ");

            int userNum = sc.nextInt();
            if (userNum == randNum ){
                System.out.println("정답입니다 ! 랜덤숫자는 ! " + userNum);
                break; };
            if(userNum > randNum){
                System.out.println("Down");
            } else {
                System.out.println("Up");
            }

        }

    }
}
