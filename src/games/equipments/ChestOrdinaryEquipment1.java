package games.equipments;

public class ChestOrdinaryEquipment1 extends BaseEquipment {
    //0010 0001
    private int markId=33;

    public int getMarkId() {
        return markId;
    }

    public ChestOrdinaryEquipment1(){
        name="傲慢之眼";
        physicDefence=8000;
        magicDefence=5000;
        equipmentRarity=EquipmentRarity.ORDINARY_EQUIPMENT;
    }
}
