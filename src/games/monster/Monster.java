package games.monster;

import games.attacksystem.Attack;
import games.attacksystem.Attackable;
import games.equipments.EquipmentsValues;
import games.experience.ExpValue;

import java.util.List;

/**
 * attackValue由子类是物理怪物还是魔法怪物确定。
 */
public class Monster implements Attackable {
    private int HP;
    private int physicDefence;
    private int magicDefence;
    private int attackValue;
    //0表示普通，1表示稀有，2表示Boss
    private int rarity;

    ExpValue expValue;
    EquipmentsValues equipmentsValues;

    public void monsterDied(Monster m){

    }

    @Override
    public void attackSingle(Attackable a1) {

    }

    @Override
    public void attackGroup(List<Attackable> list) {

    }

    @Override
    public void beAttacked(Attack attack) {

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
}
