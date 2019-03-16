package games.monster.factory;

import games.monster.Monster;
import games.monster.builder.PhysicMonsterBuilder;

public class PhysicBossMonsterFactory implements MonsterFactory {
    @Override
    public Monster createMonster(int level) {
        Monster bm = PhysicMonsterBuilder.create()
                .buildrarity(2)
                .buildSkills()
                .buildExpValue(level)
                .buildEquipmentsValues(level)
                .createDefaultPhysicMonster(level);
        return bm;
    }
}
