package games.monster.factory;

import games.monster.Monster;
import games.monster.builder.PhysicMonsterBuilder;

public class PhysicRareMonsterFactory implements MonsterFactory {
    @Override
    public Monster createMonster(int level) {
        Monster rm = PhysicMonsterBuilder.create()
                .buildrarity(1)
                .buildSkills()
                .buildExpValue(level)
                .buildEquipmentsValues(level)
                .createDefaultPhysicMonster(level);
        return rm;
    }


}
