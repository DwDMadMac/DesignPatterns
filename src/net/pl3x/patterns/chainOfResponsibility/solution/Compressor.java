package net.pl3x.patterns.chainOfResponsibility.solution;

public class Compressor extends Handler {

    /**
     * Generating construction so we can take the next handler
     *
     * @param next Get next handler
     */
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");

        /*
         * Returning false because we are not done processing or handling the request
         * so that mean the next handler in the chain should be called
         */
        return false;
    }
}
