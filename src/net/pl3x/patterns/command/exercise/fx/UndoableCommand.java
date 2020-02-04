package net.pl3x.patterns.command.exercise.fx;

public interface UndoableCommand extends Command {
    void unexecute();
}
