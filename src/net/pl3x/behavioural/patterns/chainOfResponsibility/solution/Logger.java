package net.pl3x.behavioural.patterns.chainOfResponsibility.solution;

public class Logger extends Handler {

    /**
     * Generating construction so we can take the next handler
     *
     * @param next Get next handler
     */
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");

        return false;
    }
}
