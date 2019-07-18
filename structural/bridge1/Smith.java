package structual.bridge1;

public class Smith implements WeaponHandler {
    private Weapon weapon;

    public Smith(Weapon weapon){
        this.weapon = weapon;
    }

    /*
    대장장이는 어떠한 무기가 와도 무조건 수리
     */
    @Override
    public void hanldle() {
        weapon.repair();
    }
}
