package games.monster.builder;


public abstract class AbstractBuilder {
    //以下初始值均与等级有关，除了稀有度外
    abstract AbstractBuilder buildHP(int level);
    abstract AbstractBuilder buildPhysicDefence(int level);
    abstract AbstractBuilder buildMagicDefence(int level);
    abstract AbstractBuilder buildAttackValue(int level);
    abstract AbstractBuilder buildrarity(int rarity);

}
