package net.pl3x.structural.patterns.facade.solution;

/**
 * These are the use of steps that we need to follow to send a notification
 */
public class NotificationServer {
    /*
     * Connect to server and return a "Connection" which is used
     * later to disconnect from the server
     * connect() -> Connection
     *
     * Authenticate which is provided as an identifier, "appID", which is unique
     * to each app. Also needs to provide a "key" which is like a passport for
     * each application. Return a "AuthToken" object
     * authenticate(appID, key) -> AuthToken
     *
     * We need to pass the "AuthToken" object when sending a message
     * authToken: custom token
     * message: gets message that it's passing
     * target: Specifies the target user or device
     * send(authToken, message, target)
     *
     * Now disconnect the connection
     * connection.disconnect()
     */

    /**
     * This method gets a connection and returns a Connection object
     *
     * @param ipAddress Get unique IP Address
     * @return Return unique connection
     */
    public Connection connect(String ipAddress) {
        return new Connection();
    }

    /**
     * This method athenticates the connection
     *
     * @param appID Gets custom application ID
     * @param key Gets key linked to application
     * @return Return authentication token
     */
    public AuthToken authenticate(String appID, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String Target) {
        System.out.println("Sending a message.");
    }
}
