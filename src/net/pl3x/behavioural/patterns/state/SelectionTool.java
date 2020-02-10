package net.pl3x.behavioural.patterns.state;

/*
 * Concrete State A
 *
 * With handle() methods
 *
 * This is where we implement the logic
 */
public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle.");
    }
}
