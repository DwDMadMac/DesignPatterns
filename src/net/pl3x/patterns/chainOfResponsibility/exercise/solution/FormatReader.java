package net.pl3x.patterns.chainOfResponsibility.exercise.solution;

/**
 * FormatReader{} class implements an static method for handling the next request
 */
public class FormatReader {
    /**
     * Uses the FormatRequest() class to handle the request
     *
     * @return Return all valid handled request
     */
    public static FormatRequest getFormat() {
        var quickBooks = new QuickBookFiles();
        var numbers = new NumberFiles();
        var excels = new ExcelFiles();


        quickBooks.setNext(numbers);
        numbers.setNext(excels);

        return quickBooks;
    }
}
