package games.monster.pool;

import games.monster.factory.MonsterFactory;
import games.monster.factory.MonsterFactoryDecorator;
import games.monster.factory.PhysicBossMonsterFactory;

public class PhysicBossPool extends MonsterPool {
    private static int corePoolSize=10;
    private static int maxmumPoolSize=Integer.MAX_VALUE;
    private static volatile PhysicBossPool physicBossPool;
    private MonsterFactory monsterFactory = new MonsterFactoryDecorator(new PhysicBossMonsterFactory(),this);

    private PhysicBossPool(int corePoolSize,int maxmumPoolSize){
        super(corePoolSize,maxmumPoolSize);
        super.setMonsterFactory(monsterFactory);
    }

    public static MonsterPool getMonsterPool(){
        if(physicBossPool==null){
            synchronized (PhysicBossPool.class){
                if(physicBossPool==null){
                    physicBossPool=new PhysicBossPool(corePoolSize,maxmumPoolSize);
                }
            }
        }
        return physicBossPool;
    }
}
