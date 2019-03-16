package games.monster.pool;

import games.monster.factory.MonsterFactory;
import games.monster.factory.MonsterFactoryDecorator;
import games.monster.factory.PhysicRareMonsterFactory;

public class PhysicRarePool extends MonsterPool {
    private static int corePoolSize=10;
    private static int maxmumPoolSize=Integer.MAX_VALUE;
    private static volatile PhysicRarePool physicRarePool;
    private MonsterFactory monsterFactory = new MonsterFactoryDecorator(new PhysicRareMonsterFactory(),this);

    private PhysicRarePool(int corePoolSize,int maxmumPoolSize){
        super(corePoolSize,maxmumPoolSize);
        super.setMonsterFactory(monsterFactory);
    }

    public static MonsterPool getMonsterPool(){
        if(physicRarePool==null){
            synchronized (PhysicBossPool.class){
                if(physicRarePool==null){
                    physicRarePool=new PhysicRarePool(corePoolSize,maxmumPoolSize);
                }
            }
        }
        return physicRarePool;
    }
}
