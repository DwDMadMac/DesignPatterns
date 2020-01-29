package net.pl3x.patterns.state;

public class EraserTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Eraser icon.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Eraase Something");
    }
}
