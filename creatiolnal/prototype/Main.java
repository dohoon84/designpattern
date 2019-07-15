package creational.prototype.Cat;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat(1,"navi",3);
        System.out.println(navi.getName());
        Cat ya = navi.clone();
        ya.setName("ya");
        System.out.println(ya.getId());
        System.out.println(ya.getName());
        System.out.println(ya.getAge());



    }
}
