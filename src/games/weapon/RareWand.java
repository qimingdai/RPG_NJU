package games.weapon;

public class RareWand extends BasicWeapon {
    private int markId=4;
    public RareWand(){
        name="灵魂剥离";
        physicAttack=2000;
        magicAttack=7000;
        weaponRarity=WeaponRarity.RARE_WEAPON;
    }

    public int getMarkId() {
        return markId;
    }
}
