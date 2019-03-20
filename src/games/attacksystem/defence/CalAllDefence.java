package games.attacksystem.defence;

import games.character.Role;

public class CalAllDefence {
    public static Defence calAllDefence(Role role){
        Defence defence = new Defence();

        //计算装备的总防御力
        Defence equipmentDefence = role.getEquipmentsManagement().calTotalDefence();
        System.out.println("CalAllDefence 中，算上套装效果，装备的总防御力为"+equipmentDefence);
        defence.setTotalPhysicDefence(equipmentDefence.getTotalPhysicDefence() + role.getPhysicDefence());
        defence.setTotalMagicDefence(equipmentDefence.getTotalMagicDefence() + role.getMagicDefence());
        return defence;
    }
}
