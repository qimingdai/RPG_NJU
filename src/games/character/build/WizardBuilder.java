package games.character.build;

import games.character.Wizard;

public class WizardBuilder extends RoleBuilder {
    Wizard role = Wizard.getWizardInstance();

    public static WizardBuilder create(){
        return new WizardBuilder();
    }
    public RoleBuilder buildBag(){
        /**
         * 初始化背包
         */
        return this;
    }

    public RoleBuilder buildSkills(){
        /**
         * 初始化技能
         */
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
        role.setPhysicDefence(100);
        return this;
    }

    @Override
    public RoleBuilder buildMagicDefence() {
        role.setMagicDefence(100);
        return this;
    }

    public Wizard createDefaultRole(){
        create().buildHP()
                .buildPhysicAttack()
                .buildMagicAttack()
                .buildPhysicDefence()
                .buildMagicDefence();
        this.buildBag();
        this.buildSkills();
        return role;
    }
}
