package structual.bridge1;

public class Warrior implements WeaponHandler {
    private Weapon weapon;

    public Warrior(Weapon weapon){
        this.weapon = weapon;
    }

    /*
    전사는 어떠한 무기든 무조건 공격을~
     */
    @Override
    public void hanldle() {
        weapon.attack();
    }
}
