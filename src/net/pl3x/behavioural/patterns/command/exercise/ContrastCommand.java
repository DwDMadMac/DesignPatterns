package net.pl3x.behavioural.patterns.command.exercise;

import net.pl3x.behavioural.patterns.command.exercise.fx.UndoableCommand;

public class ContrastCommand implements UndoableCommand {
    private float prevContrast;
    private EditorContrast editorContrast;
    private History history;

    public ContrastCommand(EditorContrast editorContrast, History history) {
        this.editorContrast = editorContrast;
        this.history = history;
    }

    @Override
    public void unexecute() {
        editorContrast.setContrast(prevContrast);
    }

    @Override
    public void execute() {
        prevContrast = editorContrast.getContrast(); // Store previous contrast of the video
        editorContrast.makeContrast();
        history.push(this);
    }
}
