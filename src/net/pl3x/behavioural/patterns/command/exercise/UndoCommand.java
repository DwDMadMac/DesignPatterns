package net.pl3x.behavioural.patterns.command.exercise;

import net.pl3x.behavioural.patterns.command.exercise.fx.Command;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0) {
            history.pop().unexecute();
        } else {

        }
    }
}
