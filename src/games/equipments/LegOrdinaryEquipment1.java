package games.equipments;

public class LegOrdinaryEquipment1 extends BaseEquipment{
    //0011 0001

    public int getMarkId() {
        return markId;
    }
    public LegOrdinaryEquipment1(){
        name="暴食之口";
        physicDefence=12000;
        magicDefence=6000;
        equipmentRarity=EquipmentRarity.ORDINARY_EQUIPMENT;
        markId=49;
    }
}
