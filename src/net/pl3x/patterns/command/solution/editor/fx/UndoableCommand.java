package net.pl3x.patterns.command.solution.editor.fx;

public interface UndoableCommand extends Command {
    void unexecute();
}
