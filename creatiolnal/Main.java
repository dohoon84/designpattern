package creational.factory.method.creational.factory.method1;

public class Main {
    public static void main(String[] args) {
        MakeCoffeeFactory coffee = new MakeCoffeeFactory("IceLatte");
        String str =coffee.getClass().getName();
        System.out.println(str);
        Coffee c = coffee.getCoffee("IceLatte");
        c.getName();
    }
}
