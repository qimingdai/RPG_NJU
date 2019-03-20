package games.equipments.manage;

import games.attacksystem.defence.Defence;
import games.equipments.BaseEquipment;

public interface EquipmentsManagement {
    BaseEquipment[] equipments=new BaseEquipment[3];
    boolean isOneSuit();
    int getSuitNumber();
    void wearEquipment(BaseEquipment equipment);
    void undressEquipment(BaseEquipment equipment);
    Defence calTotalDefence();
}
