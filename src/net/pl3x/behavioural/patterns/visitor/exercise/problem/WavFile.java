package net.pl3x.behavioural.patterns.visitor.exercise.problem;

import java.util.ArrayList;
import java.util.List;

/*
 * This application is planned on being shipped with a bunch of standard filters that users can
 * apply on their audio files, such as: Noise reduction, Reverb, Normalize
 *
 * We want other developers t obe able to create new filters on te form of plugins that can be imported into our application
 *
 * What are the problems with the implementation?
 * -> If you are wanting to add any additional files to this application, you would need to make modifications to both the Segment
 * class and the WavFile class before adding anything in. This can be very time consuming and not very robust
 *
 * Can the visitor pattern solve these problems? why?
 * -> By creating and using the Visitor Pattern, any developer would be able to add new filter classes on the fly without having
 * to make any modifications by only implementations
 *
 */
public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        var wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }

    public void reduceNoise() {
        for (var segment : segments)
            segment.reduceNoise();
    }

    public void addReverb() {
        for (var segment : segments)
            segment.addReverb();
    }

    public void normalize() {
        for (var segment : segments)
            segment.normalize();
    }
}
