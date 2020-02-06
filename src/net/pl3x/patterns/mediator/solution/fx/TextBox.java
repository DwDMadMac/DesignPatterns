package net.pl3x.patterns.mediator.solution.fx;

/*
 * Problem here is, we do not have access to the source code of other classes
 * and we cannot change it. We do not want to change the source code, we want to reuse it
 *
 */
public class TextBox extends UIControl {
    private String content;

    public TextBox(DialogBox owner) {
        super(owner);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        owner.changed(this);
    }
}
