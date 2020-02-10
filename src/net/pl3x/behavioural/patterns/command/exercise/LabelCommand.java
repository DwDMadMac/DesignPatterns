package net.pl3x.behavioural.patterns.command.exercise;

import net.pl3x.behavioural.patterns.command.exercise.fx.UndoableCommand;

public class LabelCommand implements UndoableCommand {
    private String prevContent;
    private EditorLabel editorLabel;
    private History history;

    public LabelCommand(EditorLabel editorLabel, History history) {
        this.editorLabel = editorLabel;
        this.history = history;
    }

    @Override
    public void unexecute() {
        editorLabel.setLabel(prevContent);
    }

    @Override
    public void execute() {
        prevContent = editorLabel.getLabel();
        editorLabel.makeLabel();
        history.push(this);
    }
}
