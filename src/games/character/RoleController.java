package games.character;

public class RoleController {
    private RoleBuilder roleBuilder;
    public RoleController(RoleBuilder roleBuilder){
        this.roleBuilder=roleBuilder;
    }
    public Role build(){
        roleBuilder.buildHP();
        roleBuilder.buildStrength();
        roleBuilder.buildIntelligence();
        roleBuilder.buildPhysicAttack();
        roleBuilder.buildMagicAttack();
        roleBuilder.buildDefence();
        roleBuilder.buildLevel();
        roleBuilder.buildMoney();
        roleBuilder.buildCrystal();
        Role role = roleBuilder.createRole();
        return role;
    }
}
