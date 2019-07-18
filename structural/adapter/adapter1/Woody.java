package structual.adapter1;

public class Woody implements Toy {
    @Override
    public void display(String name) {
        System.out.println("this is toy!! toy name is "+name);
    }
}
