package net.pl3x.patterns.command.solution.editor;

import net.pl3x.patterns.command.solution.editor.fx.Command;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    /*
     * If there is nothing in the history the history.pop().unexecute(); will throw an exception
     * To fix this we can add a new method inside the History{} class called size(){}
     */
    @Override
    public void execute() {
        if (history.size() > 0){
            history.pop().unexecute();
        }
    }
}
