package games.attacksystem.command;

import games.character.Role;
import games.equipments.BaseEquipment;

public class WearEquipmentCommand implements WearCommand {
    private Role role;

    public WearEquipmentCommand(Role role){
        this.role=role;
    }
    @Override
    public void wearEquipments(BaseEquipment equipment) {
        System.out.println("执行WearEquipCommand命令");
        role.wearEquipments(equipment);
    }
}
