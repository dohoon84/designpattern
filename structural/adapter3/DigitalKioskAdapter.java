package structual.adapter3;

public class DigitalKioskAdapter implements DigitalKioskSP1 {

    private DigitalKiosk digitalKiosk;

    public DigitalKioskAdapter(DigitalKiosk digitalKiosk){
        this.digitalKiosk = digitalKiosk;
    }

    @Override
    public void orderDisplay(String order) {
        digitalKiosk.orderDisplay(order);
    }

    @Override
    public void printReceipt() {
        System.out.println("영수증내역을 확인하세요.");
        System.out.println("=============NEW=============");
        System.out.println("하단 영수증내용이 출력됩니다.");
    }

    @Override
    public boolean payment(String type) {
        return digitalKiosk.payment(type);

    }
}
