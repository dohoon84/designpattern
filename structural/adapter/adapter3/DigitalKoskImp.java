package structual.adapter3;

public class DigitalKoskImp implements DigitalKiosk {
    @Override
    public void orderDisplay(String order) {
        System.out.println(order+"(을)를 주문하셨습니다.");
    }

    @Override
    public void printReceipt() {
        System.out.println("영수증내역을 확인하세요.");
    }

    @Override
    public boolean payment(String type) {
        boolean t = false;
        if(type.equalsIgnoreCase("card")) t = true;
        if(type.equalsIgnoreCase("kakaopay")) t = false;
        System.out.println(type+"을 결재수단으로 지불하셨습니다.");
        return t;
    }
}
