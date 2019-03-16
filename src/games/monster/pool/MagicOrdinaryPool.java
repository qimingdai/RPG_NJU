package games.monster.pool;

import games.monster.factory.*;

public class MagicOrdinaryPool extends MonsterPool {
    private static int corePoolSize=10;
    private static int maxmumPoolSize=Integer.MAX_VALUE;
    private static volatile MagicOrdinaryPool magicOrdinaryPool;
    private MonsterFactory monsterFactory = new MonsterFactoryDecorator(new MagicOrdinaryMonsterFactory(),this);

    private MagicOrdinaryPool(int corePoolSize,int maxmumPoolSize){
        super(corePoolSize,maxmumPoolSize);
        super.setMonsterFactory(monsterFactory);
    }

    public static MonsterPool getMonsterPool(){
        if(magicOrdinaryPool==null){
            synchronized (MagicOrdinaryPool.class){
                if(magicOrdinaryPool==null){
                    magicOrdinaryPool=new MagicOrdinaryPool(corePoolSize,maxmumPoolSize);
                }
            }
        }
        return magicOrdinaryPool;
    }
}
