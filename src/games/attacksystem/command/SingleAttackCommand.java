package games.attacksystem.command;


import games.attacksystem.Combatable;
import games.equipments.BaseEquipment;


public class SingleAttackCommand implements AttackCommand {
    Combatable combatable;

    public SingleAttackCommand(Combatable combatable) {
        this.combatable = combatable;
    }

    @Override
    public void executeAttack(Combatable c1) {
        System.out.println("开始执行SingleAttackCommand，进攻"+c1);
       combatable.attackSingle(c1);
    }

}
