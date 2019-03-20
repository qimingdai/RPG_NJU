package games.equipments.manage;

import games.attacksystem.defence.Defence;
import games.equipments.BaseEquipment;
import games.equipments.enhence.ArtifactSuitEnhence;
import games.equipments.enhence.EquipmentEnhence;
import games.equipments.enhence.OrdinarySuitEnhence;
import games.equipments.enhence.RareSuitEnhence;

public class ArrayBasedManagement implements EquipmentsManagement {
    //确定套装增强的效果
    private EquipmentEnhence equipmentEnhence;

    @Override
    public boolean isOneSuit() {
        for(int i=0;i<equipments.length;i++){
            if(equipments[i]== null){
                return false;
            }else {
                if(equipments[0].getSuitInfo().getNumber()!= equipments[i].getSuitInfo().getNumber()){
                    return false;
                }
            }
        }
        int suitNumber=equipments[0].getSuitInfo().getNumber();
        if(suitNumber == 1){
            equipmentEnhence = new OrdinarySuitEnhence();
        }else if(suitNumber == 2){
            equipmentEnhence = new RareSuitEnhence();
        }else if(suitNumber == 4){
            equipmentEnhence = new ArtifactSuitEnhence();
        }
        return true;
    }

    @Override
    public void wearEquipment(BaseEquipment equipment) {
        int index = equipment.getPartInfo().getNumber();
        equipments[index-1]=equipment;
        System.out.println("穿上"+equipment+"装备成功");
    }

    @Override
    public void undressEquipment(BaseEquipment equipment) {
        int index = equipment.getPartInfo().getNumber();
        equipments[index-1]=null;
        System.out.println("脱下"+equipment+"装备成功");
    }

    @Override
    public int getSuitNumber() {
        if(isOneSuit()){
            return equipments[0].getSuitInfo().getNumber();
        }
        return 0;
    }

    @Override
    public Defence calTotalDefence() {
        Defence defence = new Defence();
        int tempPhysic=0;
        int tempMagic=0;
        for(int i=0;i<equipments.length;i++){
            if(equipments[i]!=null){
                tempPhysic+=equipments[i].getPhysicDefence();
                tempMagic+=equipments[i].getMagicDefence();
            }
        }
        defence.setTotalPhysicDefence(tempPhysic);
        defence.setTotalMagicDefence(tempMagic);
        if(isOneSuit()){
            Defence enhanceDefence = equipmentEnhence.enhanceResult();
            defence.setTotalPhysicDefence(defence.getTotalPhysicDefence() + enhanceDefence.getTotalPhysicDefence());
            defence.setTotalMagicDefence(defence.getTotalMagicDefence() + enhanceDefence.getTotalMagicDefence());
        }
        return defence;
    }
}
