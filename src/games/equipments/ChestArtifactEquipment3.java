package games.equipments;

public class ChestArtifactEquipment3 extends BaseEquipment {
    //0010 0100
    private int markId=36;

    public int getMarkId() {
        return markId;
    }

    public ChestArtifactEquipment3(){
        name="苍天之天幕：卷层云";
        physicDefence=14000;
        magicDefence=12000;
        equipmentRarity=EquipmentRarity.ARTIFACT_EQUIPMENT;
    }
}
