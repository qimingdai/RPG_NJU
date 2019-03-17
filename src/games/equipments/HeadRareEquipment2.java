package games.equipments;

public class HeadRareEquipment2 extends BaseEquipment {
    //0001 0010
    private int markId=18;

    public HeadRareEquipment2() {
        name="崩坏的二次元";
        physicDefence=4000;
        magicDefence=12000;
        equipmentRarity=EquipmentRarity.RARE_EQUIPMENT;
    }

    public int getMarkId() {
        return markId;
    }
}
