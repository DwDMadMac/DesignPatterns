package net.pl3x.behavioural.patterns.state;

/*
 * Concrete State B
 *
 * With handle() methods
 *
 * This is where we implement the logic
 */
public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Brush Icon.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line.");
    }
}
