package net.pl3x.behavioural.patterns.chainOfResponsibility.problem;

/**
 * This class is purely for authentication requests,
 * which ensures the request was sent from an valid users
 */
public class Authenticator {
    public boolean authenticate(HttpRequest httpRequest) {
        /*
         * Can have some logic like if the user is Admin
         * and the password is correct that means this is a valid request
         *
         * In a real Application this class needs to query a database to
         * make sure this is a valid request
         */
        var isValid = (httpRequest.getUsername() == "admin" && httpRequest.getPassword() == "1234");

        System.out.println("Authentication");
        return isValid;
    }
}
