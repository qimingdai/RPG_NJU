package games.weapon;

public class OrdinarySword extends BasicWeapon {

    private int markId=1;

    public OrdinarySword(){
        name="妖刀村正";
        physicAttack=5000;
        magicAttack=1000;
        weaponRarity=WeaponRarity.ORDINARY_WEAPON;
    }

    public int getMarkId() {
        return markId;
    }
}
