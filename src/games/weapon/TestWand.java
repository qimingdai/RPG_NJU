package games.weapon;

/**
 * @author : daiqiming
 * @date : 2019/7/22
 * @Description :
 */
public class TestWand extends BasicWeapon {
    private int markId=10;

    public int getMarkId() {
        return markId;
    }

    public TestWand(){
        name="娜迦王";
        physicAttack=20000;
        magicAttack=12000;
        weaponRarity=WeaponRarity.ARTIFACT_WEAPON;
    }
}
