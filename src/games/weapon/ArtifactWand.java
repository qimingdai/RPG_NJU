package games.weapon;

public class ArtifactWand extends BasicWeapon{
    private int markId=11;

    public int getMarkId() {
        return markId;
    }

    public ArtifactWand(){
        name="末世流光";
        physicAttack=12000;
        magicAttack=21000;
        weaponRarity=WeaponRarity.ARTIFACT_WEAPON;
    }
}
