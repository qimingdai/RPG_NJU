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

    public static void main(String[] args){
        MonsterPool monsterPool =  MagicBossPool.getMonsterPool();
        List<Monster> list = monsterPool.getMonster(1,25);
        System.out.println(list);
        List<Monster> list1 = monsterPool.getMonster(2,30);
        for(Monster m:list1){
            System.out.println(m);
            m.monsterDied(m);
        }
//        MonsterPool pool2 = PhysicRarePool.getMonsterPool();
//        List<Monster> l2 = pool2.getMonster(11,20);
//        System.out.println(l2);
    }
}
