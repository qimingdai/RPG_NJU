package games.monster;

import games.monster.pool.MonsterPool;

public class MonsterDecorator extends Monster{
    private Monster monster;
    private MonsterPool pool;
    public MonsterDecorator(Monster monster, MonsterPool pool){
        this.monster=monster;
        this.pool=pool;
        super.setHP(monster.getHP());

    }

    @Override
    public void monsterDied(Monster m){
        pool.destroyMonster(m);
    }

    @Override
    public String toString() {
        return "MonsterDecorator{" +
                "monster=" + monster +
                ", pool=" + pool +
                '}';
    }
}
