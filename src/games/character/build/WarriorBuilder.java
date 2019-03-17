package games.character.build;

import games.attacksystem.command.Command;
import games.character.Role;
import games.character.Warrior;

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
        return role;
    }
}
