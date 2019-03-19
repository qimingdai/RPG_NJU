package games.character;

import games.character.build.WarriorBuilder;
import games.equipments.BaseEquipment;
import games.equipments.EquipmentPrototype;
import games.utils.EquipmentSuitUtils;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class test {
    public static void main(String[] args){
        Role role = WarriorBuilder.create()
                    .createDefaultRole();

        //加载原型
        EquipmentPrototype.loadPrototype();

        //苍穹之天幕
        int markId13=20;//头肩
        int markId23=36;//胸甲
        int markId33=52;//腿甲
        BaseEquipment be13 = EquipmentPrototype.getEquipmentPrototype(markId13);
        BaseEquipment be23 = EquipmentPrototype.getEquipmentPrototype(markId23);
        BaseEquipment be33 = EquipmentPrototype.getEquipmentPrototype(markId33);
        role.wearEquipments(be13);
        role.wearEquipments(be33);

        role.wearEquipments(be23);
        BaseEquipment[] demp = role.getEquipments();
        if(EquipmentSuitUtils.isOneSuit(role)){
            System.out.println("是一套装备，是"+demp[0].getSuitInfo().getName()+"套装");
        }else {
            System.out.println("不是一套装备");
        }
    }
}
