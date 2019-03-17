package games.equipments;

public class LegRareEquipment2 extends BaseEquipment{
    //0100 0010
    private int markId=66;

    public int getMarkId() {
        return markId;
    }

    public LegRareEquipment2(){
        name="执着的自恋狂";
        physicDefence=6000;
        magicDefence=10000;
        equipmentRarity=EquipmentRarity.RARE_EQUIPMENT;
    }
}
