package games.weapon;

public class RareSword extends BasicWeapon{
    private int markId=3;
    public RareSword(){
        name="圣耀救赎";
        physicAttack=7000;
        magicAttack=1000;
        weaponRarity=WeaponRarity.RARE_WEAPON;
    }

    public int getMarkId() {
        return markId;
    }


}
