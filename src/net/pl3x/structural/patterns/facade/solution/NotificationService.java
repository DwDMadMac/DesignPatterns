package net.pl3x.structural.patterns.facade.solution;

/**
 * This class is coupled to these four classes and if any of the classes changes in
 * the future, this is the only place where we would need to make modifications
 *
 * The clients of this class can pass simple String objects in the send() method
 * and they do not need to be coupled to the Message{} class
 */
public class NotificationService {
    public void send(String message, String target) {
        // Create notification server
        var server = new NotificationServer();
        // Connect to server
        var connection = server.connect("ip");
        // Tell the server who we are
        var authToken = server.authenticate("appID","Key");
        // create message object
        // Send message
        server.send(authToken,new Message(message),target);
        // Disconnect
        connection.disconnect();
    }
}
