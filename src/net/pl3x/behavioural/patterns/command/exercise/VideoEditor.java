package net.pl3x.behavioural.patterns.command.exercise;

/*
 * What pattern would you use to implement this feature?
 * The memento or the command pattern?
 * Why?
 *
 * It is better to use the memento pattern in this case because storing multiple instances
 * of the video editor can become very expensive with memory. This way if we need to undo an
 * video editor it will undo to its last original size
 */
public class VideoEditor {
    private float contrast = 0.5f;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void removeText() {
        this.text = "";
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "contrast=" + contrast +
                ", text='" + text + '\'' +
                '}';
    }
}
