package games.monster.factory;

import games.monster.Monster;
import games.monster.builder.PhysicMonsterBuilder;

public class PhysicOrdinaryMonsterFactory implements MonsterFactory{
    @Override
    public Monster createMonster(int level) {
        Monster om = PhysicMonsterBuilder.create()
                .buildrarity(0)
                .buildSkills()
                .buildExpValue(level)
                .buildExpValue(level)
                .createDefaultPhysicMonster(level);
        return om;
    }
}
