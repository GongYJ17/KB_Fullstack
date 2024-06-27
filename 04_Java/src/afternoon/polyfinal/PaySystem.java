package afternoon.polyfinal;

public class PaySystem {
    // pay를 부모로 가진 애들은 다 들어갈 수 있게 하는 것.
    // 가급적 변수는 private으로 설정하는 게 외부유출에 막을 수 있음.
    private Pay pay;

    // 부모가 Pay인 애들을 받아서
    public void setPay(Pay pay) {
        // PaySystem에서 설정한 변수 pay에다가 받은 kakaopay 등을 넣어준다.
        this.pay = pay;
    }

    public void payment(int amount) {
        System.out.println("결제를 시작합니다.");
        // 위에서 받아온 자식들의 정보를 기반으로 overring된 pay메서드 실행됨.
        pay.pay(amount);
    }


}
