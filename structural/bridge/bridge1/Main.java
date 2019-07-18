package structual.bridge1;

public class Main {
    public static void main(String[] args) {
        WeaponHandler warrior = new Warrior(new Sword());
        warrior.hanldle();

        WeaponHandler smith = new Smith(new Bow());
        smith.hanldle();

    }
}
