package structual.bridge1;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("bow attack");
    }

    @Override
    public void repair() {
        System.out.println("bow repair");
    }
}
