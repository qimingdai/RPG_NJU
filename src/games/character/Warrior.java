package games.character;

import games.attacksystem.Attack;
import games.attacksystem.Attackable;
import games.skills.BasicSkill;

import java.util.List;

public class Warrior extends Role {
    private List<BasicSkill> skillList;
    @Override
    public void attackSingle(Attackable a1) {
        super.attackSingle(a1);
    }

    @Override
    public void attackGroup(List<Attackable> list) {
        super.attackGroup(list);
    }

    @Override
    public void beAttacked(Attack attack) {
        super.beAttacked(attack);
    }
}
