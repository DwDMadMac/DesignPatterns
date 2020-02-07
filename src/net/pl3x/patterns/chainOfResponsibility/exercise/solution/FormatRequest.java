package net.pl3x.patterns.chainOfResponsibility.exercise.solution;

/**
 * The FormatRequest{} file checks, sets & reads the file extension
 */
public abstract class FormatRequest {
    private FormatRequest next;

    /**
     * Setter, takes care of setting the next handler
     *
     * @param next Set net handler
     */
    public void setNext(FormatRequest next) {
        this.next = next;
    }

    /**
     * Blueprint/Template for handling the next handle
     *
     * @param fileName Gets file name ext
     */
    public void read(String fileName) {
        if (fileName.endsWith(getExtension())){
            doRead(fileName);
            return;
        }

        if (next != null){
            next.read(fileName);
        } else {
            throw new UnsupportedOperationException("File format not supported.");
        }
    }

    /**
     * Abstract method for getting the file ext
     *
     * @return Return file extension
     */
    protected abstract String getExtension();

    /**
     * We want to check if the filename was inputted
     *
     * @param fileName Check for filename
     */
    protected abstract void doRead(String fileName);
}
