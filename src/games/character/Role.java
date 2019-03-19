package games.character;


import games.attacksystem.Combatable;
import games.attacksystem.mediator.Mediator;
import games.equipments.BaseEquipment;

public class Role implements Combatable,Wearable {
    protected int HP;
    protected int physicAttack;
    protected int magicAttack;
    protected int physicDefence;
    protected int magicDefence;
    protected Mediator mediator;

    /**
     *   用数组来表示穿戴的装备
     *   index 0：头肩；1：胸甲，2：腿甲
     */
    protected BaseEquipment[] equipments = new BaseEquipment[3];

    @Override
    public void attackSingle(Combatable combatable) {
        mediator.launchAttack(this,combatable);
    }

    @Override
    public boolean isKilled() {
        if(this.HP<=0){
            return true;
        }
        return false;
    }

    @Override
    public void beKilled() {
        System.out.println("人死了");
    }

    @Override
    public void beAttacked() {
        /**
         * 状态改变
         */
    }

    @Override
    public void wearEquipments(BaseEquipment equipment) {
        /**
         * 穿戴装备，当赋值给装备数组的时候，需要将脱下来的装备放置背包中
         */
        //该index对应于装备数组中的顺序，但partNumber比Index大1
        int index = equipment.getPartInfo().getNumber();
        equipments[index-1]=equipment;
    }



    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getPhysicAttack() {
        return physicAttack;
    }

    public void setPhysicAttack(int physicAttack) {
        this.physicAttack = physicAttack;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    public int getPhsicDefence() {
        return physicDefence;
    }

    public void setPhysicDefence(int physicDefence) {
        this.physicDefence = physicDefence;
    }

    public int getMagicDefence() {
        return magicDefence;
    }

    public void setMagicDefence(int magicDefence) {
        this.magicDefence = magicDefence;
    }

    public int getPhysicDefence() {
        return physicDefence;
    }

    public BaseEquipment[] getEquipments() {
        return equipments;
    }

    public void setEquipments(BaseEquipment[] equipments) {
        this.equipments = equipments;
    }

    @Override
    public String toString() {
        return "Role{" +
                "HP=" + HP +
                ", physicAttack=" + physicAttack +
                ", magicAttack=" + magicAttack +
                ", physicDefence=" + physicDefence +
                ", magicDefence=" + magicDefence +
                '}';
    }
}
