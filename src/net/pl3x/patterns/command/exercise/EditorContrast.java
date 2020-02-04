package net.pl3x.patterns.command.exercise;

public class EditorContrast {
    private float contrast;

    public void makeContrast() {
        contrast = 5F; // set default contrast settings
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }
}
