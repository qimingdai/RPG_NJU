package games.equipments;

import java.util.HashMap;

public class BaseEquipment implements Cloneable{
    protected String name;
    protected int physicDefence;
    protected int magicDefence;
    protected EquipmentRarity equipmentRarity;
    protected int markId;

    @Override
    protected BaseEquipment clone() {
        BaseEquipment be = null;
        try{
            be = (BaseEquipment) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return be;
    }

    //根据套装ID,得到套装的信息
    public EquipmentSuitName getSuitInfo(){
        int suit1 = EquipmentSuitName.ORDINARY_SUIT.getNumber();
        int suit2 = EquipmentSuitName.RARE_SUIT.getNumber();
        int suit3 = EquipmentSuitName.ARTIFACT_SUIT.getNumber();
        if((markId&suit1)==suit1){
            return EquipmentSuitName.ORDINARY_SUIT;
        }else if((markId&suit2)==suit2){
            return EquipmentSuitName.RARE_SUIT;
        }else if((markId&suit3)==suit3){
            return EquipmentSuitName.ARTIFACT_SUIT;
        }
        return null;
    }

    //根据装备部位的ID，得到装备部位的信息
    public EquipmentPartName getPartInfo(){
        int part1 = EquipmentPartName.HEAD_PART.getNumber();
        int part2 = EquipmentPartName.CHEST_PART.getNumber();
        int part3 = EquipmentPartName.LEG_PART.getNumber();
        if( ((markId >>> 4)|part1) == part1){
            return EquipmentPartName.HEAD_PART;
        }else if( ((markId >>> 4)|part2) == part2){
            return EquipmentPartName.CHEST_PART;
        }else if( ((markId >>> 4)|part3) == part3){
            return EquipmentPartName.LEG_PART;
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public int getPhysicDefence() {
        return physicDefence;
    }

    public int getMagicDefence() {
        return magicDefence;
    }

    public EquipmentRarity getEquipmentRarity() {
        return equipmentRarity;
    }

    @Override
    public String toString() {
        return "BaseEquipment{" +
                "name='" + name + '\'' +
                ", physicDefence=" + physicDefence +
                ", magicDefence=" + magicDefence +
                ", equipmentRarity=" + equipmentRarity +
                ", markId=" + markId +
                '}';
    }
}
