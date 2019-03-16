package games.attacksystem;

import java.util.List;

public interface Attackable {
    void attackSingle(Attackable a1);
    void attackGroup(List<Attackable> list);

    /**
     *
     */
    void beAttacked(Attack attack);
}
