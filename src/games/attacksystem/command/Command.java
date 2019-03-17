package games.attacksystem.command;

import games.attacksystem.Combatable;

public interface Command {
    public void executeAttack(Combatable combatable);
}
