package net.pl3x.behavioural.patterns.visitor.exercise.solution;

import java.util.ArrayList;
import java.util.List;

/*
 * This application is planned on being shipped with a bunch of standard filters that users can
 * apply on their audio files, such as: Noise reduction, Reverb, Normalize
 *
 * We want other developers to be able to create new filters on te form of plugins that can be imported into our application
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

/**
 * This class will be the core of our exercise where we will generate the segment list and
 * simulate reading a wav file while building segments
 */
public class WavFile {
    private List<Segment> segmentsList = new ArrayList<>();

    /**
     * for exercise purposes we will simulate reading a wav file
     * and then the building of segments
     *
     * @param fileName Read file name
     * @return Return wav file
     */
    public static WavFile read(String fileName){
        // Simulate reading a wav file and building segments
        var wavFile = new WavFile();
        wavFile.segmentsList.add(new FormatSegment());
        wavFile.segmentsList.add(new FactSegment());
        wavFile.segmentsList.add(new FactSegment());
        wavFile.segmentsList.add(new FactSegment());

        return wavFile;
    }

    /**
     * This method is an extensibility point, which passes new operations (filters)
     * to it without modifying it
     *
     * @param filterOperation Pass new filter
     */
    public void execute(FilterOperation filterOperation) {
        for (var segment : segmentsList)
            segment.applyFilter(filterOperation);
    }
}
