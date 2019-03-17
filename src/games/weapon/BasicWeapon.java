package games.weapon;

public class BasicWeapon implements Cloneable{
    protected String name;
    protected int physicAttack;
    protected int magicAttack;
    protected WeaponRarity weaponRarity;

    public void calAttackValue(){
        /**
         * 换算攻击力
         */
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhysicAttack(int physicAttack) {
        this.physicAttack = physicAttack;
    }
    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    public String getName() {
        return name;
    }
    public int getPhysicAttack() {
        return physicAttack;
    }
    public int getMagicAttack() {
        return magicAttack;
    }

    public WeaponRarity getWeaponRarity() {
        return weaponRarity;
    }

    public void setWeaponRarity(WeaponRarity weaponRarity) {
        this.weaponRarity = weaponRarity;
    }

    @Override
    protected BasicWeapon clone() {
        BasicWeapon bw = null;
        try{
            bw = (BasicWeapon) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return bw;
    }
}
