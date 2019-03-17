package games.equipments;

public class HeadArtifactEquipment3 extends BaseEquipment {
    //0001 0100
    private int markId=20;

    public int getMarkId() {
        return markId;
    }

    public HeadArtifactEquipment3(){
        name="苍天之丰绿：卷云";
        physicDefence=13000;
        magicDefence=9000;
        equipmentRarity=EquipmentRarity.ARTIFACT_EQUIPMENT;
    }
}
