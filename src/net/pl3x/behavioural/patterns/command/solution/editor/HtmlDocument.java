package net.pl3x.behavioural.patterns.command.solution.editor;

/*
 * Implements our Business logic and knows nothing about 'Commands'
 *
 * This would considered part of the business layer of an application
 */
public class HtmlDocument {
    private String content;

    public void makeBold() {
        content = "<b>" + content + "</b>"; // Business logic
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
