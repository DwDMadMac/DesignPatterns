package net.pl3x.patterns.chainOfResponsibility.solution;

/**
 * Each Handler should make a reference to the next handler in the chain
 *
 * Template/Blueprint
 * -> We basically ned a template/blueprint for handling request
 */
public abstract class Handler {
    private Handler next;

    /**
     * Generating construction so we can take the next handler
     *
     * @param next Get next handler
     */
    public Handler(Handler next) {
        this.next = next;
    }

    /**
     * Blueprint/Template for handling request
     *
     * @param request Handle request
     */
    public void handle(HttpRequest request){
        /*
         * This is also our Template Method Pattern
         *
         * If the process returns true, stop here.
         */
        if (doHandle(request)) {
            return;
        }

        /*
         * If the process is not completed, call the next
         * process in the chain
         */
        if (next != null) {
            next.handle(request);
        }
    }

    /**
     * We do not know how to handle or request so we want to
     * check is the request was completed or not
     *
     * @param request Check for processed or not
     * @return Return true if it was processed
     */
    public abstract boolean doHandle(HttpRequest request);
}
