package games.attacksystem.command;

import games.attacksystem.Combatable;
import games.equipments.BaseEquipment;

public interface AttackCommand {
    /**
     * 进攻怪物命令
     * @param combatable
     */
    void executeAttack(Combatable combatable);


}
