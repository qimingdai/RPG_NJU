package games.character;

public abstract class RoleBuilder {
    Role role = new Role();
    abstract void buildHP();
    abstract void buildStrength();
    abstract void buildIntelligence();
    abstract void buildPhysicAttack();
    abstract void buildMagicAttack();
    abstract void buildDefence();
    abstract void buildLevel();
    abstract void buildMoney();
    abstract void buildCrystal();

    public Role createRole(){
        return role;
    }
}
