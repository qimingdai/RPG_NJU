package games.attacksystem;

public interface Combatable {
    void attackSingle(Combatable combatable);

    /**
     *
     */
    void beAttacked();
    boolean isKilled();
    void beKilled();
}
