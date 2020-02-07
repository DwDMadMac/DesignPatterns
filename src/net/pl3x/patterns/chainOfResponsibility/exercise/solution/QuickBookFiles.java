package net.pl3x.patterns.chainOfResponsibility.exercise.solution;

/**
 * QuickBookFiles{} class extends FormatRequest to check the file extension
 */
public class QuickBookFiles extends FormatRequest {

    /**
     * Gets the file extension
     *
     * @return File Extension
     */
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    /**
     * Gets the filename
     *
     * @param fileName Check for filename
     */
    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from QuickBook workbooks.");
    }
}
