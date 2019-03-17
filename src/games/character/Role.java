package games.character;


import games.attacksystem.Combatable;
import games.attacksystem.command.Command;
import games.attacksystem.mediator.Mediator;

public class Role implements Combatable {
    protected int HP;
    protected int physicAttack;
    protected int magicAttack;
    protected int physicDefence;
    protected int magicDefence;
    protected Mediator mediator;

    @Override
    public void attackSingle(Combatable combatable) {
        mediator.launchAttack(this,combatable);
    }

    @Override
    public boolean isKilled() {
        if(this.HP<=0){
            return true;
        }
        return false;
    }

    @Override
    public void beKilled() {
        System.out.println("人死了");
    }

    @Override
    public void beAttacked() {
        /**
         * 状态改变
         */
    }


    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
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

    public void setPhysicDefence(int physicDefence) {
        this.physicDefence = physicDefence;
    }

    public int getMagicDefence() {
        return magicDefence;
    }

    public void setMagicDefence(int magicDefence) {
        this.magicDefence = magicDefence;
    }

    @Override
    public String toString() {
        return "Role{" +
                "HP=" + HP +
                ", physicAttack=" + physicAttack +
                ", magicAttack=" + magicAttack +
                ", physicDefence=" + physicDefence +
                ", magicDefence=" + magicDefence +
                '}';
    }
}
