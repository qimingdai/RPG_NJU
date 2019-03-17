package games.equipments;

import java.util.HashMap;

public class HeadOrdinaryEquipment1 extends BaseEquipment{
    //0001 0001
    private int markId=17;

    public int getMarkId() {
        return markId;
    }

    public HeadOrdinaryEquipment1(){
        name="贪婪之手";
        physicDefence=10000;
        magicDefence=6000;
        equipmentRarity=EquipmentRarity.ORDINARY_EQUIPMENT;
    }
}
