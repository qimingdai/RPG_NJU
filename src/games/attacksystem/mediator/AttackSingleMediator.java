package games.attacksystem.mediator;

import games.attacksystem.Combatable;
import games.attacksystem.command.SingleAttackCommand;
import games.character.Warrior;
import games.character.build.WarriorBuilder;
import games.monster.Monster;
import games.monster.pool.MonsterPool;
import games.monster.pool.PhysicRarePool;

import java.util.List;

public class AttackSingleMediator implements Mediator {
    private Combatable combatable1;
    private Combatable combatable2;

    public AttackSingleMediator(Combatable combatable1, Combatable combatable2) {
        this.combatable1 = combatable1;
        this.combatable2 = combatable2;
    }

    public Combatable getCombatable1() {
        return combatable1;
    }

    public void setCombatable1(Combatable combatable1) {
        this.combatable1 = combatable1;
    }

    public Combatable getCombatable2() {
        return combatable2;
    }

    public void setCombatable2(Combatable combatable2) {
        this.combatable2 = combatable2;
    }

    @Override
    public void launchAttack(Combatable c1, Combatable c2) {
        c2.beAttacked();
        if(c2.isKilled()){
            c2.beKilled();
        }
    }

    @Override
    public void launchListAttack(Combatable c1, List<Combatable> list2) {
    }

    public static void main(String[] args){
        Warrior warrior = WarriorBuilder.create().createDefaultRole();
        System.out.println(warrior);
        SingleAttackCommand sac = new SingleAttackCommand(warrior);
        MonsterPool mp = PhysicRarePool.getMonsterPool();
        List<Monster> list = mp.getMonster(2,10);
        for(Monster m: list){
            AttackSingleMediator am = new AttackSingleMediator(warrior,m);
            warrior.setMediator(am);
            System.out.println(m);
            sac.executeAttack(m);


        }
    }

}
