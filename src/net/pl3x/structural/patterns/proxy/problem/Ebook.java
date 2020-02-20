package net.pl3x.structural.patterns.proxy.problem;

public class Ebook {
    private String fileName;

    /**
     * Initilize the fileName field
     *
     * @param fileName Get file name
     */
    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    /**
     * This method will read the file from the disc
     */
    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

    /**
     * This method will show the ebook
     */
    public void show() {
        System.out.println("Showing the ebook " + fileName);
    }

    /**
     * This method is for getting the file name
     *
     * @return Return file name
     */
    public String getFileName() {
        return fileName;
    }
}
