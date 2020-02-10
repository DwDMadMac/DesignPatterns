package net.pl3x.behavioural.patterns.chainOfResponsibility.exercise.problem;

/*
 * Building an accounting application
 *
 * We need to allow the user to import their data in a variety of formats such as:
 * -> Excel Spreadsheets (Windows) 'xls'
 * -> Number Spreadsheets (Mac) 'numbers'
 * -> QuickBook Workbooks (Special accounting software) 'qbw'
 *
 * Refactor this code and use the chain responsibility pattern to solve these problems.
 */
public class DataReader {
    public void read(String fileName) {
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
        }
        else if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
        }
        else if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
        }
        else
            throw new UnsupportedOperationException("File format not supported.");
    }
}
