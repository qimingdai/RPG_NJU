package games.monster.pool;

import games.monster.factory.MagicRareMonsterFactory;
import games.monster.factory.MonsterFactory;
import games.monster.factory.MonsterFactoryDecorator;

public class MagicRarePool extends MonsterPool {
    private static volatile MagicRarePool magicRarePool;
    private static int corePoolSize=10;
    private static int maxmumPoolSize=Integer.MAX_VALUE;
    private MonsterFactory monsterFactory = new MonsterFactoryDecorator(new MagicRareMonsterFactory(),this);

    private MagicRarePool(int corePoolSize,int maxmumPoolSize){
        super(corePoolSize,maxmumPoolSize);
        super.setMonsterFactory(monsterFactory);
    }

    public static MonsterPool getMonsterPool(){
        if(magicRarePool==null){
            synchronized (MagicRarePool.class){
                if(magicRarePool==null){
                    magicRarePool = new MagicRarePool(corePoolSize,maxmumPoolSize);
                }
            }
        }
        return magicRarePool;
    }
}
