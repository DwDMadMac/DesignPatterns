package net.pl3x.behavioural.patterns.command.exercise.fx;

public interface UndoableCommand extends Command {
    void unexecute();
}
