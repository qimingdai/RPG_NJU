package games.attacksystem.command;

import games.character.Role;
import games.equipments.BaseEquipment;

public class UndressEquipmentCommand implements UndressCommand {
    private Role role;

    public UndressEquipmentCommand(Role role) {
        this.role = role;
    }

    @Override
    public void undressEquipment(BaseEquipment equipment) {
        System.out.println("执行UndressEquipmentCommand命令");
        role.undressEquipment(equipment);
    }
}
