package net.pl3x.behavioural.patterns.command.solution.editor.fx;

public interface UndoableCommand extends Command {
    void unexecute();
}
