package games.equipments;

public class LegArtifactEquipment3 extends BaseEquipment{
    //0100 0100
    private int markId=68;

    public int getMarkId() {
        return markId;
    }

    public LegArtifactEquipment3(){
        name="苍天之河川：层云";
        physicDefence=18000;
        magicDefence=13000;
        equipmentRarity=EquipmentRarity.ARTIFACT_EQUIPMENT;
    }
}
