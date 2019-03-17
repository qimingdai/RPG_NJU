package games.weapon;


public class ArtifactSword extends BasicWeapon {
    private int markId=10;

    public int getMarkId() {
        return markId;
    }

    public ArtifactSword(){
        name="末日预言";
        physicAttack=20000;
        magicAttack=12000;
        weaponRarity=WeaponRarity.ARTIFACT_WEAPON;
    }
}
