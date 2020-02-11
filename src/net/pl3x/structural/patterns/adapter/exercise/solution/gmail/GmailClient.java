package net.pl3x.structural.patterns.adapter.exercise.solution.gmail;

/**
 * Our Third-Party Library Class
 */
public class GmailClient {
    /**
     * Connect to gmail client
     */
    public void connect() {
        System.out.println("Connecting to Gmail");
    }

    /**
     * Download all gmail client emails
     */
    public void getEmails() {
        System.out.println("Downloading emails from Gmail");
    }

    /**
     * Disconnect for gmail client
     */
    public void disconnect() {
        System.out.println("Disconnecting from Gmail");
    }
}
