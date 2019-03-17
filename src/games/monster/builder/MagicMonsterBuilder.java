package games.monster.builder;

import games.monster.MagicMonster;
import games.monster.Monster;

public class MagicMonsterBuilder extends AbstractBuilder {
    private MagicMonster magicMonster=new MagicMonster();

    public static MagicMonsterBuilder create(){
        return new MagicMonsterBuilder();
    }

    /**
     * 以下Build均缺少具体数值
     * @param level
     * @return
     */
    @Override
    public MagicMonsterBuilder buildHP(int level) {
        return this;
    }

    @Override
    public MagicMonsterBuilder buildPhysicDefence(int level) {
        return this;
    }

    @Override
    public MagicMonsterBuilder buildMagicDefence(int level) {
        return this;
    }

    @Override
    public MagicMonsterBuilder buildAttackValue(int level) {
        return this;
    }

    @Override
    public MagicMonsterBuilder buildrarity(int rarity) {
        return this;
    }

    public MagicMonsterBuilder buildSkills(){
        return this;
    }

    public MagicMonsterBuilder buildExpValue(int level){
        return this;
    }

    public MagicMonsterBuilder buildEquipmentsValues(int level){
        return this;
    }

    public Monster createDefaultMonster(int level){
        buildHP(level);
        buildPhysicDefence(level);
        buildMagicDefence(level);
        buildAttackValue(level);
        return magicMonster;
    }
}
