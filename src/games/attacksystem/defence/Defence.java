package games.attacksystem.defence;

/**
 * 用作 计算装备的总物理防御 和总魔法防御。
 */
public class Defence {
    private int totalPhysicDefence=0;
    private int totalMagicDefence=0;

    public int getTotalPhysicDefence() {
        return totalPhysicDefence;
    }

    public void setTotalPhysicDefence(int totalPhysicDefence) {
        this.totalPhysicDefence = totalPhysicDefence;
    }

    public int getTotalMagicDefence() {
        return totalMagicDefence;
    }

    public void setTotalMagicDefence(int totalMagicDefence) {
        this.totalMagicDefence = totalMagicDefence;
    }

    @Override
    public String toString() {
        return "Defence{" +
                "totalPhysicDefence=" + totalPhysicDefence +
                ", totalMagicDefence=" + totalMagicDefence +
                '}';
    }
}
