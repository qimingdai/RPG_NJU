package games.equipments.enhence;

import games.attacksystem.defence.Defence;

public class ArtifactSuitEnhence implements EquipmentEnhence {
    /**
     * 神器套装效果：双防+ 30000
     * @return
     */
    @Override
    public Defence enhanceResult() {
        Defence defence = new Defence();
        defence.setTotalPhysicDefence(defence.getTotalPhysicDefence() + 30000);
        defence.setTotalMagicDefence(defence.getTotalMagicDefence() + 30000);
        return defence;
    }
}
