package games.character.build;

import games.character.Warrior;
import games.equipments.manage.ArrayBasedManagement;
import games.equipments.manage.EquipmentsManagement;

public class WarriorBuilder extends RoleBuilder {
    private Warrior role = Warrior.getWarriorInstance();

    public static WarriorBuilder create(){
        return new WarriorBuilder();
    }

    public RoleBuilder buildBag() {
        return this;
    }
    public RoleBuilder buildSkills(){
        return this;
    }
    public RoleBuilder buildEquipmentManagement(){
        role.setEquipmentsManagement(new ArrayBasedManagement());
        return this;
    }

    @Override
    public RoleBuilder buildHP() {
        role.setHP(100);
        return this;
    }

    @Override
    public RoleBuilder buildPhysicAttack() {
        role.setPhysicAttack(100);
        return this;
    }

    @Override
    public RoleBuilder buildMagicAttack() {
        role.setMagicAttack(100);
        return this;
    }

    @Override
    public RoleBuilder buildPhysicDefence() {
        role.setPhysicDefence(1000);
        return this;
    }

    @Override
    public RoleBuilder buildMagicDefence() {
        role.setMagicDefence(1000);
        return this;
    }


    public Warrior createDefaultRole(){
        this.buildHP()
                .buildPhysicAttack()
                .buildMagicAttack()
                .buildPhysicDefence()
                .buildMagicDefence();
        this.buildBag();
        this.buildSkills();
        this.buildEquipmentManagement();
        return role;
    }
}
