package structual.bridge1;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("sword attack");
    }

    @Override
    public void repair() {
        System.out.println("sword repair");
    }
}
