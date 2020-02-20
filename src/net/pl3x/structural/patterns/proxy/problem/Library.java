package net.pl3x.structural.patterns.proxy.problem;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> ebooks = new HashMap<>();

    /**
     * This method will add the eboo to the library
     *
     * @param ebook Add ebook to library
     */
    public void add(Ebook ebook){
        ebooks.put(ebook.getFileName(), ebook);
    }

    /**
     * This method will open an Ebook
     *
     * @param fileName Get ebook name
     */
    public void openEbook(String fileName){
        if (fileName != null) {
            ebooks.get(fileName).show();
            return;
        }

        throw new NullPointerException("This Ebook does not exist.");
    }
}
