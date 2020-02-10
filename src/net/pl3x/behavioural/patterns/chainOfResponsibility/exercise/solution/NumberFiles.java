package net.pl3x.behavioural.patterns.chainOfResponsibility.exercise.solution;

/**
 * NumberFiles{} class extends FormatRequest to check the file extension
 */
public class NumberFiles extends FormatRequest {

    /**
     * Gets the file extension
     *
     * @return File Extension
     */
    @Override
    protected String getExtension() {
        return ".numbers";
    }

    /**
     * Gets the filename
     *
     * @param fileName Check for filename
     */
    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from Numbers spreadsheet.");
    }
}
