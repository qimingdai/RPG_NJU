package games.character;

import games.attacksystem.command.WearCommand;
import games.attacksystem.command.WearEquipmentCommand;
import games.attacksystem.defence.CalAllDefence;
import games.attacksystem.defence.Defence;
import games.character.build.WarriorBuilder;
import games.equipments.BaseEquipment;
import games.equipments.EquipmentPrototype;
import games.equipments.manage.ArrayBasedManagement;

public class test {
    public static void main(String[] args){
        Role role = WarriorBuilder.create()

                    .createDefaultRole();

        //加载原型
        EquipmentPrototype.loadPrototype();

        //苍穹之天幕
        int markId13=20;//头肩
        int markId23=36;//胸甲
        int markId33=52;//腿甲

        int markId11 = 17; //普通头肩

//        BaseEquipment be13 = EquipmentPrototype.getEquipmentPrototype(markId13);
        BaseEquipment be23 = EquipmentPrototype.getEquipmentPrototype(markId23);
        BaseEquipment be33 = EquipmentPrototype.getEquipmentPrototype(markId33);

        BaseEquipment be11 = EquipmentPrototype.getEquipmentPrototype(markId11);

        WearCommand wearCommand = new WearEquipmentCommand(role);
        wearCommand.wearEquipments(be11);
        wearCommand.wearEquipments(be23);
        wearCommand.wearEquipments(be33);

        Defence defence = CalAllDefence.calAllDefence(role);
        System.out.println("物理总防御"+defence.getTotalPhysicDefence() + "        魔法总防御："+defence.getTotalMagicDefence());

    }
}
