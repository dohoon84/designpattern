package creational.prototype.Cat;

public class Cat implements Cloneable{

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cat(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return (Cat)super.clone();
    }
}
