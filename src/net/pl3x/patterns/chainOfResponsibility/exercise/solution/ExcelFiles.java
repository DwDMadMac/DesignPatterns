package net.pl3x.patterns.chainOfResponsibility.exercise.solution;

/**
 * ExcelFiles{} class extends FormatRequest to check the file extension
 */
public class ExcelFiles extends FormatRequest {

    /**
     * Gets the file extension
     *
     * @return File Extension
     */
    @Override
    protected String getExtension() {
        return ".xls";
    }

    /**
     * Gets the filename
     *
     * @param fileName Check for filename
     */
    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from Excel spreadsheet.");
    }
}
