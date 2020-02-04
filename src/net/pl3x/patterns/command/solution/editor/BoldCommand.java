package net.pl3x.patterns.command.solution.editor;

import net.pl3x.patterns.command.solution.editor.fx.UndoableCommand;

/*
 * Concrete implementation of the command interface
 */
public class BoldCommand implements UndoableCommand {
    private String prevContent; // Stores our previous content from the document
    private HtmlDocument document; // Reference to the document object
    private History history; // Reference to history object

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = document.getContent(); // Store previous content of the document
        document.makeBold(); // Delegating/forwarding the actual work (tell the content to make it self bold)
        history.push(this); // Tell history to record this command
    }
}
