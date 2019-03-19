package games.equipments;

public class ChestRareEquipment2 extends BaseEquipment {
    //0010 0010

    public int getMarkId() {
        return markId;
    }

    public ChestRareEquipment2(){
        name="妄想的偏执狂";
        physicDefence=9000;
        magicDefence=15000;
        equipmentRarity=EquipmentRarity.RARE_EQUIPMENT;
        markId=34;
    }
}
