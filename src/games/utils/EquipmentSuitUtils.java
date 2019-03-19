package games.utils;

import games.character.Role;
import games.equipments.BaseEquipment;

public class EquipmentSuitUtils {

    public static boolean isOneSuit(Role role){
        BaseEquipment[] equipments = role.getEquipments();

        for(int i=0;i<equipments.length;i++){
            System.out.println(equipments[i]);
            if(equipments[i]== null){
                return false;
            }else {
                if(equipments[0].getSuitInfo().getNumber()!= equipments[i].getSuitInfo().getNumber()){
                    return false;
                }
            }
        }
        return true;
    }
}
