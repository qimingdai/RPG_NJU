package games.equipments.enhence;

import games.attacksystem.defence.Defence;

public class OrdinarySuitEnhence implements EquipmentEnhence {
    /**
     * 普通套装增强效果：双防御各+10000
     * @return
     */
    @Override
    public Defence enhanceResult() {
        Defence defence = new Defence();
        defence.setTotalPhysicDefence(defence.getTotalPhysicDefence()+10000);
        defence.setTotalMagicDefence(defence.getTotalMagicDefence()+10000);
        return defence;
    }
}
