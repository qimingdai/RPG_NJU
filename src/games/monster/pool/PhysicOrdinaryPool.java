package games.monster.pool;

import games.monster.factory.MonsterFactory;
import games.monster.factory.MonsterFactoryDecorator;
import games.monster.factory.PhysicOrdinaryMonsterFactory;

public class PhysicOrdinaryPool extends MonsterPool {
    private static volatile PhysicOrdinaryPool physicOrdinaryPool;
    private static int corePoolSize=10;
    private static int maxmumPoolSize=Integer.MAX_VALUE;
    private MonsterFactory monsterFactory = new MonsterFactoryDecorator(new PhysicOrdinaryMonsterFactory(),this);

    private PhysicOrdinaryPool(int corePoolSize,int maxmumPoolSize){
        super(corePoolSize,maxmumPoolSize);
        super.setMonsterFactory(monsterFactory);
    }

    public static MonsterPool getMonsterPool(){
        if(physicOrdinaryPool==null){
            synchronized (MagicRarePool.class){
                if(physicOrdinaryPool==null){
                    physicOrdinaryPool = new PhysicOrdinaryPool(corePoolSize,maxmumPoolSize);
                }
            }
        }
        return physicOrdinaryPool;
    }
}
