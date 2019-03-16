package games.monster.pool;

import games.monster.factory.MagicBossMonsterFactory;
import games.monster.factory.MonsterFactory;
import games.monster.factory.MonsterFactoryDecorator;

public class MagicBossPool extends MonsterPool {
    private MonsterFactory monsterFactory = new MonsterFactoryDecorator(new MagicBossMonsterFactory(),this);
    private static int corePoolSize=10;
    private static int maxmumPoolSize=Integer.MAX_VALUE;
    public static volatile MagicBossPool magicBossPool;

    private MagicBossPool(int corePoolSize, int maxmumPoolSize){
        super(corePoolSize,maxmumPoolSize);
        this.setMonsterFactory(monsterFactory);
    }

    public static MagicBossPool getMonsterPool(){
        if(magicBossPool==null){
            synchronized (MagicBossPool.class){
                if(magicBossPool==null){
                    magicBossPool=new MagicBossPool(corePoolSize,maxmumPoolSize);
                }
            }
        }
        return magicBossPool;
    }

}
