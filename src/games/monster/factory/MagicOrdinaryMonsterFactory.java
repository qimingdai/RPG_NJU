package games.monster.factory;

import games.monster.Monster;
import games.monster.builder.MagicMonsterBuilder;

public class MagicOrdinaryMonsterFactory implements MonsterFactory {
    @Override
    public Monster createMonster(int level) {
        Monster om = MagicMonsterBuilder.create()
                .buildrarity(0)
                .buildSkills()
                .buildExpValue(level)
                .buildEquipmentsValues(level)
                .createDefaultMonster(level);
        return om;
    }
}
