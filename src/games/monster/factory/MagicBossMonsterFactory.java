package games.monster.factory;

import games.monster.Monster;
import games.monster.builder.MagicMonsterBuilder;

public class MagicBossMonsterFactory implements MonsterFactory {
    @Override
    public Monster createMonster(int level) {
        Monster bm = MagicMonsterBuilder.create()
                .buildrarity(2)
                .buildSkills()
                .buildExpValue(level)
                .buildEquipmentsValues(level)
                .createDefaultMonster(level);
        return bm;
    }
}
