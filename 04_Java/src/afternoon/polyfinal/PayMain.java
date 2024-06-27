// PayMain
package afternoon.polyfinal;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        // 사용자가 어떤 페이를 사용할 지를 받아서 사용함.
        Scanner scanner = new Scanner(System.in);
        // 1번은 kko 2번은 kb 등 번호로 선택할 수 있게끔.
        int option;
        //금액
        int amount;

        System.out.println("결제 옵션을 입력하시오. (1. KB페이 / 2. KAKAO페이 / 3. Naver 페이) : ");
        option = scanner.nextInt();
        System.out.println("결제 금액을 입력하시오. : ");
        amount = scanner.nextInt();

        if (option == 1) {
            KBPay kbPay = new KBPay();
            paySystem.setPay(kbPay);
        } else if (option == 2) {
            paySystem.setPay(new KaKaoPay());
        } else if (option == 3) {
            paySystem.setPay(new NaverPay());
        }

        paySystem.payment(amount);
    }
}
