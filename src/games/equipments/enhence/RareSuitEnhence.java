package games.equipments.enhence;

import games.attacksystem.defence.Defence;

public class RareSuitEnhence implements EquipmentEnhence {
    /**
     * 稀有套装增强效果：双防各+ 20000
     * @return
     */
    @Override
    public Defence enhanceResult() {
        Defence defence = new Defence();
        defence.setTotalPhysicDefence(defence.getTotalPhysicDefence() + 20000);
        defence.setTotalMagicDefence(defence.getTotalMagicDefence() + 20000);
        return defence;
    }
}
