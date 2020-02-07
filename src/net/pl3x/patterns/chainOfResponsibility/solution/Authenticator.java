package net.pl3x.patterns.chainOfResponsibility.solution;

/**
 * This class is purely for authentication requests,
 * which ensures the request was sent from an valid users
 */
public class Authenticator  extends Handler {


    /**
     * Generating construction so we can take the next handler
     *
     * @param next Get next handler
     */
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" && request.getPassword() == "1234");

        String authOutput = (isValid) ? "Authentication" : "Authentication Failed.";

        System.out.println(authOutput);

        /*
         * To make sure that the next process or handler is called we must apply
         * the '!' operator to the 'isValid' variable
         */
        return !isValid;
    }
}
