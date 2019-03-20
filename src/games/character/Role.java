package games.character;


import games.attacksystem.Combatable;
import games.attacksystem.mediator.Mediator;
import games.equipments.BaseEquipment;
import games.equipments.manage.ArrayBasedManagement;
import games.equipments.manage.EquipmentsManagement;

public class Role implements Combatable,Wearable {
    protected int HP;
    protected int physicAttack;
    protected int magicAttack;
    protected int physicDefence;
    protected int magicDefence;
    protected Mediator mediator;

    /**
     *   基于数组实现的装备管理类
     *
     */
    protected EquipmentsManagement equipmentsManagement;

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
        equipmentsManagement.wearEquipment(equipment);
    }

    @Override
    public void undressEquipment(BaseEquipment equipment) {
        equipmentsManagement.undressEquipment(equipment);
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

    public EquipmentsManagement getEquipmentsManagement() {
        return equipmentsManagement;
    }

    public void setEquipmentsManagement(EquipmentsManagement equipmentsManagement) {
        this.equipmentsManagement = equipmentsManagement;
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
