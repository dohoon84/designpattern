package structual.adapter1;

public class Main {
    public static void main(String[] args) {
        ToyAdapter toyAdapter = new ToyAdapter(new Woody());
        toyAdapter.play("woody");
        Doll pinkpong = new Pinkpong();
        pinkpong.play("pinkpong");
        Toy woody1 = new Woody();
        woody1.display("woody2");
    }
}
