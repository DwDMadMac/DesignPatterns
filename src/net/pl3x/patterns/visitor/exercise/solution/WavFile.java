package net.pl3x.patterns.visitor.exercise.solution;

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
 * This class will be the implementation of all and new filters added which is a concrete class
 */
public class WavFile {
    private List<Filters> filtersList = new ArrayList<>();

    /**
     * This method adds a new filter
     *
     * @param filter Add new filter
     */
    public void add(Filters filter) {
        filtersList.add(filter);
    }

    /**
     * This method is an extensibility point, which passes new operations
     * to it without modifying it
     *
     * @param segment Pass new operation
     */
    public void execute(Segment segment) {
        for (var filter : filtersList)
            filter.execute(segment);
    }
}
