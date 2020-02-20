package net.pl3x.structural.patterns.proxy.solution;

public interface Ebook {
    /**
     * This method will show the Ebook
     */
    void show();

    /**
     * This method will get the file name for the Ebook
     *
     * @return Return Ebook file name
     */
    String getFileName();
}
