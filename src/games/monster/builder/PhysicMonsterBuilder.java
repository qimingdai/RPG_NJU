package games.monster.builder;

import games.monster.Monster;
import games.monster.PhysicMonster;

public class PhysicMonsterBuilder extends AbstractBuilder {
    private PhysicMonster physicMonster = new PhysicMonster();
    public static PhysicMonsterBuilder create(){
        return new PhysicMonsterBuilder();
    }

    @Override
    public PhysicMonsterBuilder buildHP(int level) {
        physicMonster.setHP(100);
        return this;
    }

    @Override
    public PhysicMonsterBuilder buildPhysicDefence(int level) {
        physicMonster.setPhysicDefence(1000);
        return this;
    }

    @Override
    public PhysicMonsterBuilder buildMagicDefence(int level) {
        physicMonster.setMagicDefence(1000);
        return this;
    }

    @Override
    public PhysicMonsterBuilder buildAttackValue(int level) {
        physicMonster.setAttackValue(200);
        return this;
    }

    //以下稀有度、技能、持有的经验以及掉落的装备都需要在抽象工厂中构建确定
    @Override
    public PhysicMonsterBuilder buildrarity(int rarity) {
        physicMonster.setRarity(rarity);
        return this;
    }

    public PhysicMonsterBuilder buildSkills(){
        return this;
    }

    //怪物掉落的经验、装备与等级有关
    public PhysicMonsterBuilder buildExpValue(int level){
        return this;
    }

    public PhysicMonsterBuilder buildEquipmentsValues(int level){
        return this;
    }

    public Monster createDefaultPhysicMonster(int level){
        this.buildHP(level)
                .buildPhysicDefence(level)
                .buildMagicDefence(level)
                .buildAttackValue(level);
        return physicMonster;
    }


}
