package games.monster.factory;

import games.monster.Monster;
import games.monster.builder.MagicMonsterBuilder;

public class MagicRareMonsterFactory implements MonsterFactory {
    @Override
    public Monster createMonster(int level) {
        Monster rm = MagicMonsterBuilder.create()
                .buildrarity(1)
                .buildSkills()
                .buildExpValue(level)
                .buildEquipmentsValues(level)
                .createDefaultMonster(level);
        return rm;
    }
}
