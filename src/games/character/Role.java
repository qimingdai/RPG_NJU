package games.character;


import games.attacksystem.Attack;
import games.attacksystem.Attackable;
import games.skills.BasicSkill;

import java.util.List;

public class Role implements Attackable {
    private int HP;
    private int physicAttack;
    private int magicAttack;
    private int physicDefence;
    private int magicDefence;


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

    public int getPhysicAttack() {
        return physicAttack;
    }

    public void setPhysicAttack(int physicAttack) {
        this.physicAttack = physicAttack;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    public int getPhsicDefence() {
        return physicDefence;
    }

    public void setPhsicDefence(int physicDefence) {
        this.physicDefence = physicDefence;
    }

    public int getMagicDefence() {
        return magicDefence;
    }

    public void setMagicDefence(int magicDefence) {
        this.magicDefence = magicDefence;
    }




}
