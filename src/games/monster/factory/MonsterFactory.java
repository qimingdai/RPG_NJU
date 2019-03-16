package games.monster.factory;

import games.monster.Monster;

public interface MonsterFactory {
    public Monster createMonster(int level);

}
