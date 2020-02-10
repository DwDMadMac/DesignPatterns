package net.pl3x.behavioural.patterns.chainOfResponsibility.solution;

public class Encryptor extends Handler {
    /**
     * Generating construction so we can take the next handler
     *
     * @param next Get next handler
     */
    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encrtyption");

        return false;
    }
}
