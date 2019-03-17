package games.attacksystem.mediator;

import games.attacksystem.Combatable;

import java.util.List;

public interface Mediator {
    void launchAttack(Combatable c1,Combatable c2);
    void launchListAttack(Combatable c1, List<Combatable> list2);
}
