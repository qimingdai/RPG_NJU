package games.monster;

import games.attacksystem.Combatable;
import games.equipments.EquipmentsValues;
import games.experience.ExpValue;

/**
 * attackValue由子类是物理怪物还是魔法怪物确定。
 */
public class Monster implements Combatable {
    private int HP;
    private int physicDefence;
    private int magicDefence;
    private int attackValue;
    //0表示普通，1表示稀有，2表示Boss
    private int rarity;

    private ExpValue expValue;
    private EquipmentsValues equipmentsValues;

    public void monsterDied(Monster m){

    }

    @Override
    public void attackSingle(Combatable combatable) {

    }

    @Override
    public boolean isKilled() {
        if(HP<=0){
            return true;
        }
        return false;
    }

    @Override
    public void beAttacked() {
        System.out.println("怪物被攻击了，血量需要发生变化");
    }

    @Override
    public void beKilled() {
        System.out.println("怪物死了");
        monsterDied(this);
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getPhysicDefence() {
        return physicDefence;
    }

    public void setPhysicDefence(int physicDefence) {
        this.physicDefence = physicDefence;
    }

    public int getMagicDefence() {
        return magicDefence;
    }

    public void setMagicDefence(int magicDefence) {
        this.magicDefence = magicDefence;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public ExpValue getExpValue() {
        return expValue;
    }

    public void setExpValue(ExpValue expValue) {
        this.expValue = expValue;
    }

    public EquipmentsValues getEquipmentsValues() {
        return equipmentsValues;
    }

    public void setEquipmentsValues(EquipmentsValues equipmentsValues) {
        this.equipmentsValues = equipmentsValues;
    }


    @Override
    public String toString() {
        return "Monster{" +
                "HP=" + HP +
                ", physicDefence=" + physicDefence +
                ", magicDefence=" + magicDefence +
                ", attackValue=" + attackValue +
                ", rarity=" + rarity +
                ", expValue=" + expValue +
                ", equipmentsValues=" + equipmentsValues +
                '}';
    }
}
