package afternoon.polyfinal;

import java.util.Scanner;

public class PaySystem2 {

    private Pay pay;
    Scanner scanner = new Scanner(System.in);

    // 부모가 Pay인 애들을 받아서
    public void setPay(Pay pay) {
        // PaySystem에서 설정한 변수 pay에다가 받은 kakaopay 등을 넣어준다.
        this.pay = pay;
    }



    public void selectPay() {
        System.out.println("결제 옵션을 입력하시오. (1. KB페이 / 2. KAKAO페이 / 3. Naver 페이) : ");
        int option = scanner.nextInt();
        findPay(option);
    }

    public void findPay(int option) {
        if (option == 1) {
            KBPay kbPay = new KBPay();
            this.setPay(kbPay);
        } else if (option == 2) {
            this.setPay(new KaKaoPay());
        } else if (option == 3) {
            this.setPay(new NaverPay());
        }

    }

    public void selectAmount() {
        System.out.println("결제 금액을 입력하시오. : ");
        int amount = scanner.nextInt();
        this.payment(amount);
    }

    public void payment(int amount) {
        System.out.println("결제를 시작합니다.");
        // 위에서 받아온 자식들의 정보를 기반으로 overring된 pay메서드 실행됨.
        pay.pay(amount);
    }


}
