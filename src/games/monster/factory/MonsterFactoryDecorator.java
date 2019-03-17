package games.monster.factory;

import games.monster.Monster;
import games.monster.MonsterDecorator;
import games.monster.pool.MagicBossPool;
import games.monster.pool.MonsterPool;
import games.monster.pool.PhysicRarePool;

import java.util.List;

public class MonsterFactoryDecorator implements MonsterFactory {
    MonsterFactory monsterFactory;
    MonsterPool pool;
    public MonsterFactoryDecorator(MonsterFactory monsterFactory, MonsterPool pool){
        this.monsterFactory=monsterFactory;
        this.pool=pool;
    }
    @Override
    public Monster createMonster(int level) {
        Monster m =  monsterFactory.createMonster(level);
        return new MonsterDecorator(m, pool);
    }


}
