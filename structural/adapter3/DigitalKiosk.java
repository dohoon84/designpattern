package structual.adapter3;

public interface DigitalKiosk {
    public void orderDisplay(String order);
    public void printReceipt();
    public boolean payment(String type);
}
