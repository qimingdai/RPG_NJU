package games.weapon;

public class OrdinaryWand extends BasicWeapon {
    private int markId=2;
    public OrdinaryWand(){
        name="阴阳四天";
        physicAttack=1000;
        magicAttack=5000;
        weaponRarity=WeaponRarity.ORDINARY_WEAPON;
    }

    public int getMarkId() {
        return markId;
    }
}
