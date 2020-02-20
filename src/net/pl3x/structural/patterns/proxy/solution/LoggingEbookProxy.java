package net.pl3x.structural.patterns.proxy.solution;

public class LoggingEbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    /**
     * Initialize the file name field
     *
     * @param fileName Get file name
     */
    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    /**
     * This method will show the ebook
     */
    @Override
    public void show() {
        // Lazy initialization
        if (ebook == null){
            ebook = new RealEbook(fileName);
        }

        /*
         * Here is where we would to perform some logging
         */
        System.out.println("Logging");
        /*
         * Then once we have performed the additional tasks
         * we can show the ebook
         */
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
