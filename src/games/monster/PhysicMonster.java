package games.monster;

import games.equipments.EquipmentsValues;
import games.experience.ExpValue;
import games.skills.BasicSkill;

import java.util.ArrayList;
import java.util.List;

public class PhysicMonster extends Monster {
    public List<BasicSkill> list = new ArrayList<>();


    
    public List<BasicSkill> getList() {
        return list;
    }

    public void setList(List<BasicSkill> list) {
        this.list = list;
    }


}
