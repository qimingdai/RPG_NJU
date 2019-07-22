package games.weapon;

/**
 * @author : daiqiming
 * @date : 2019/7/22
 * @Description :
 */
public class TestSword extends BasicWeapon{
    private int markId=10;

    public int getMarkId() {
        return markId;
    }

    public TestSword(){
        name="幸运的五彩石";
        physicAttack=20000;
        magicAttack=12000;
        weaponRarity=WeaponRarity.ARTIFACT_WEAPON;
    }
}
