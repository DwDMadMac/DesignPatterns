package net.pl3x.structural.patterns.proxy.solution;

public class RealEbook implements Ebook {
    private String fileName;

    /**
     * Initilize the fileName field
     *
     * @param fileName Get file name
     */
    public RealEbook(String fileName) {
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
    @Override
    public void show() {
        System.out.println("Showing the ebook " + fileName);
    }

    /**
     * This method is for getting the file name
     *
     * @return Return file name
     */
    @Override
    public String getFileName() {
        return fileName;
    }
}
