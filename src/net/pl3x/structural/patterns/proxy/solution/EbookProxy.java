package net.pl3x.structural.patterns.proxy.solution;

public class EbookProxy implements Ebook {
    private String fileName;
    /*
     * We also need a reference to a real Ebook, because in
     * this proxy class we are going to forward all the messages
     * and all the operations to a real Ebook. This proxy is
     * merely an Agent that sits between the library and the
     * Ebook.
     *
     * We are not going to initialize this Ebook field because
     * creating an Ebook is costly. We want to initialize this
     * field only when we need to use it.
     */
    private RealEbook ebook;

    /**
     * Initialize the file name field
     *
     * @param fileName Get file name
     */
    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    /**
     * In this method we show an Ebook
     */
    @Override
    public void show() {
        /*
         * We will perform lazy initialization
         */
        if (ebook == null){
            ebook = new RealEbook(fileName);
        }

        /*
         * We are forwarding a task of showing an Ebook to this
         * real Ebook object
         */
        ebook.show();
    }

    /**
     * This method will get the file name
     *
     * @return Return file name
     */
    @Override
    public String getFileName() {
        return fileName;
    }
}
