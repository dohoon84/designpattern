package structual.adapter3;

public class Main {
    public static void main(String[] args) {
        DigitalKiosk kiosk = new DigitalKoskImp();
        kiosk.orderDisplay("햄버거");
        kiosk.payment("card");
        kiosk.printReceipt();

        DigitalKioskSP1 kiosk2 = new DigitalKioskAdapter(kiosk);
        kiosk2.orderDisplay("햄버거");
        kiosk2.payment("card");
        kiosk2.printReceipt();
    }
}
