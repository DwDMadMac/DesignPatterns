package net.pl3x.behavioural.patterns.visitor.solution;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Text-Heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("text-anchor");
    }
}
