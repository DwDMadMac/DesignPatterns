package net.pl3x.behavioural.patterns.chainOfResponsibility.problem;

public class WebServer {
    public void handle(HttpRequest request) {
        /*
         * Authentication
         * Logging
         * Compression
         * Etc.
         *
         * We do not want to apply these tasks inside these WebServer class
         * because that would violate the single responsibility principle
         * We should implement each task inside its own separate class
         */
        var authenticator = new Authenticator();
        authenticator.authenticate(request);
        /*
         * The problem with this approach
         *
         * Since we applied the 'new' keyword to the Authenticator() method
         * The WebServer class is tightly coupled to the implementation we
         * have added. To solve this problem, we can extract an interface from
         * the Authenticator() Class and have our WebServer{} talk to an
         * Authenticator Interface.
         *
         * Even though with an interface, we will decouple the WebServer
         * from the other objects and the order of these actions will be hard coded
         * inside this class. If in the future we want to disable logged for
         * certain scenarios, we cannot do so! We would have to come back to this
         * Class and change the code. If we wanted to add another step like
         * Encryption again we would have to come back and change the code
         * in this class. This is the problem that the 'Chain Of Responsibility'
         * Solves
         */
    }
}
